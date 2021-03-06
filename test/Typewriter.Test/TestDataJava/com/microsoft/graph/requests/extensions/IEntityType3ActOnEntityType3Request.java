// Template Source: IBaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Endpoint;
import com.microsoft.graph.requests.extensions.IEntityType3ActOnEntityType3Request;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entity Type3Act On Entity Type3Request.
 */
public interface IEntityType3ActOnEntityType3Request extends IHttpRequest {

    /**
     * Gets the Endpoint
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Endpoint> callback);

    /**
     * Gets the Endpoint
     *
     * @return the Endpoint
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Endpoint get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEntityType3ActOnEntityType3Request select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEntityType3ActOnEntityType3Request expand(final String value);

}
