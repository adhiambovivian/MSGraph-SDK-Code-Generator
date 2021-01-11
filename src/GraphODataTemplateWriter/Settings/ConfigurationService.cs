﻿// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.

namespace Microsoft.Graph.ODataTemplateWriter.Settings
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Linq;
    using System.Reflection;
    using System.Reflection.Emit;
    using Vipr.Core;

    /// <summary>
    /// The ConfigurationService configures the template writer with the target language and 
    /// other properties used to direct how the code files are generated.
    /// </summary>
    public static class ConfigurationService
    {
        private static IConfigurationProvider _configurationProvider;
        private static string targetLanguage = null;
        private static string endpointVersion = null;
        private static Dictionary<string, string> properties = null;

        public static void Initialize(IConfigurationProvider configurationProvider, string targetLanguage = null, IEnumerable<string> properties = null, string endpointVersion = "v1.0")
        {
            ConfigurationService.endpointVersion = endpointVersion;

            _configurationProvider = configurationProvider;
            if (!String.IsNullOrEmpty(targetLanguage))
            {
                ConfigurationService.targetLanguage = targetLanguage;
            }
            if (properties != null)
            {
                Dictionary<string, string> propertyDictionary = new Dictionary<string, string>();
                foreach (string property in properties)
                {
                    string[] props = property.Split(':');

                    if (props.Length != 2)
                    {
                        throw new ArgumentException("A property was set in a unexpected form from the typewriter commandline.", "-p -properties");
                    }

                    propertyDictionary.Add(props[0], props[1]);
                }

                ConfigurationService.properties = propertyDictionary;
            }
            else
                ConfigurationService.properties = null; //important: to avoid subsequent flaky tests due to shared app domain
        }

        private static TemplateWriterSettings LoadSettingsForLanguage()
        {
            TemplateWriterSettings mainTWS = _configurationProvider.GetConfiguration<TemplateWriterSettings>();

            if (targetLanguage != null)
            {
                mainTWS.TargetLanguage = targetLanguage;
            }
            if (properties != null)
            {
                mainTWS.Properties = properties;
            }

            mainTWS.DefaultBaseEndpointUrl = String.Format("https://graph.microsoft.com/{0}", endpointVersion);

            //Call the generic GetConfiguration method with our new type.
            var languageSettings = (_configurationProvider
                .GetType()
                .GetConstructor(new [] { typeof(string) })
                .Invoke(new[] { targetLanguage }) as IConfigurationProvider)
                .GetConfiguration<TemplateWriterSettings>();

            mainTWS.CopyLanguageSettings(languageSettings);
            return mainTWS;

        }
        /// <summary>
        /// Simple "caching" implementation that compromises bettween performance impact, avoiding flaky unit tests because of a shared app domain and not having to refactor this whole settings implementation
        /// </summary>
        private static Dictionary<string, TemplateWriterSettings> simpleSettingsCache = new Dictionary<string, TemplateWriterSettings>();
        public static TemplateWriterSettings Settings
        {
            get
            {
                var settingsCacheKey = $"{targetLanguage}-{endpointVersion}-{(properties?.Any() ?? false ? properties.OrderBy(x => x.Key).Select(x => x.Key + ":" + x.Value).Aggregate((x, y) => x + y) : string.Empty)}";
                if (!simpleSettingsCache.ContainsKey(settingsCacheKey))
                    simpleSettingsCache.Add(settingsCacheKey, _configurationProvider != null ? LoadSettingsForLanguage() : new TemplateWriterSettings());
                return simpleSettingsCache[settingsCacheKey];
            }
        }
    }
}
