// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenotePageForwardRequest;
import com.microsoft.graph.requests.extensions.OnenotePageForwardRequest;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Forward Request Builder.
 */
public class OnenotePageForwardRequestBuilder extends BaseActionRequestBuilder implements IOnenotePageForwardRequestBuilder {

    /**
     * The request builder for this OnenotePageForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param toRecipients the toRecipients
     * @param details the details
     * @param comment the comment
     */
    public OnenotePageForwardRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<Recipient> toRecipients, final String details, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("toRecipients", toRecipients);
        bodyParams.put("details", details);
        bodyParams.put("comment", comment);
    }
    /**
     * The request builder for this OnenotePageForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param toRecipients the toRecipients
     * @param comment the comment
     */
    public OnenotePageForwardRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<Recipient> toRecipients, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("toRecipients", toRecipients);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IOnenotePageForwardRequest
     *
     * @return the IOnenotePageForwardRequest instance
     */
    public IOnenotePageForwardRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IOnenotePageForwardRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageForwardRequest instance
     */
    public IOnenotePageForwardRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OnenotePageForwardRequest request = new OnenotePageForwardRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("toRecipients")) {
            request.body.toRecipients = getParameter("toRecipients");
        }

        if (hasParameter("details")) {
            request.body.details = getParameter("details");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
