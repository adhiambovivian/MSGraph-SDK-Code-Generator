// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEntityType3CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType3RequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType3CollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type3Collection Request Builder.
 */
public class EntityType3CollectionRequestBuilder extends BaseRequestBuilder implements IEntityType3CollectionRequestBuilder {

    /**
     * The request builder for this collection of EntityType3
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType3CollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IEntityType3CollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IEntityType3CollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new EntityType3CollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEntityType3RequestBuilder byId(final String id) {
        return new EntityType3RequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
