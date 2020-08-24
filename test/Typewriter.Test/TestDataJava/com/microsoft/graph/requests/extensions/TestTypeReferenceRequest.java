// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Type Reference Request.
 */
public class TestTypeReferenceRequest extends BaseRequest implements ITestTypeReferenceRequest {

    /**
     * The request for the TestType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TestTypeReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TestType.class);
    }

    public void delete(final ICallback<TestType> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public TestType delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITestTypeReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TestTypeReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITestTypeReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TestTypeReferenceRequest)this;
    }
    /**
     * Puts the TestType
     *
     * @param srcTestType the TestType reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(TestType srcTestType, final ICallback<TestType> callback) {
        send(HttpMethod.PUT, callback, srcTestType);
    }

    /**
     * Puts the TestType
     *
     * @param srcTestType the TestType reference to PUT
     * @return the TestType
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public TestType put(TestType srcTestType) throws ClientException {
        return send(HttpMethod.PUT, srcTestType);
    }
}
