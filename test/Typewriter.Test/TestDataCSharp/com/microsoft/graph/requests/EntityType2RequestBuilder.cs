// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: EntityRequestBuilder.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    /// <summary>
    /// The type EntityType2RequestBuilder.
    /// </summary>
    public partial class EntityType2RequestBuilder : EntityRequestBuilder, IEntityType2RequestBuilder
    {

        /// <summary>
        /// Constructs a new EntityType2RequestBuilder.
        /// </summary>
        /// <param name="requestUrl">The URL for the built request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        public EntityType2RequestBuilder(
            string requestUrl,
            IBaseClient client)
            : base(requestUrl, client)
        {
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <returns>The built request.</returns>
        public new IEntityType2Request Request()
        {
            return this.Request(null);
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>The built request.</returns>
        public new IEntityType2Request Request(IEnumerable<Option> options)
        {
            return new EntityType2Request(this.RequestUrl, this.Client, options);
        }
    
        /// <summary>
        /// Gets the request builder for EntityType2ActOnEntityType2.
        /// </summary>
        /// <returns>The <see cref="IEntityType2ActOnEntityType2RequestBuilder"/>.</returns>
        public IEntityType2ActOnEntityType2RequestBuilder ActOnEntityType2(
            string Name)
        {
            return new EntityType2ActOnEntityType2RequestBuilder(
                this.AppendSegmentToRequestUrl("microsoft.graph.ActOnEntityType2"),
                this.Client,
                Name);
        }
    
    }
}
