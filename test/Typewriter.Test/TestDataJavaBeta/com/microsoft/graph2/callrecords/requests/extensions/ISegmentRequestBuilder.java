// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Segment;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.requests.extensions.IEntityType3CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType3RequestBuilder;
import com.microsoft.graph.requests.extensions.ICallRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ISessionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.IPhotoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Segment Request Builder.
 */
public interface ISegmentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISegmentRequest instance
     */
    ISegmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISegmentRequest instance
     */
    ISegmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IEntityType3CollectionWithReferencesRequestBuilder refTypes();

    IEntityType3WithReferenceRequestBuilder refTypes(final String id);

    /**
     * Gets the request builder for Call
     *
     * @return the ICallWithReferenceRequestBuilder instance
     */
    ICallWithReferenceRequestBuilder refType();

    /**
     * Gets the request builder for Session
     *
     * @return the ISessionWithReferenceRequestBuilder instance
     */
    ISessionWithReferenceRequestBuilder sessionRef();

    /**
     * Gets the request builder for Photo
     *
     * @return the IPhotoRequestBuilder instance
     */
    IPhotoRequestBuilder photo();
    ISegmentForwardRequestBuilder forward(final java.util.List<Recipient> toRecipients, final Recipient singleRecipient, final java.util.List<Session> multipleSessions, final Session singleSession, final String comment);

    ISegmentTestActionCollectionRequestBuilder testAction(final IdentitySet value);

}