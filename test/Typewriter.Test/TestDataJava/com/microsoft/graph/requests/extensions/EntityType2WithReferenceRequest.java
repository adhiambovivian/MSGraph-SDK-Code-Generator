// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntityType2;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type2With Reference Request.
 */
public class EntityType2WithReferenceRequest extends BaseRequest implements IEntityType2WithReferenceRequest {

    /**
     * The request for the EntityType2
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType2WithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntityType2.class);
    }

    public void post(final EntityType2 newEntityType2, final IJsonBackedObject payload, final ICallback<EntityType2> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public EntityType2 post(final EntityType2 newEntityType2, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newEntityType2;
        }
        return null;
    }

    public void get(final ICallback<EntityType2> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public EntityType2 get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<EntityType2> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final EntityType2 sourceEntityType2, final ICallback<EntityType2> callback) {
		send(HttpMethod.PATCH, callback, sourceEntityType2);
	}

	public EntityType2 patch(final EntityType2 sourceEntityType2) throws ClientException {
		return send(HttpMethod.PATCH, sourceEntityType2);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEntityType2WithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IEntityType2WithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEntityType2WithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EntityType2WithReferenceRequest)this;
    }
}
