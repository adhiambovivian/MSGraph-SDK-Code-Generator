// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.requests.extensions.ITimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Schedule Request Builder.
 */
public interface IScheduleRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IScheduleRequest instance
     */
    IScheduleRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IScheduleRequest instance
     */
    IScheduleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITimeOffCollectionRequestBuilder timesOff();

    ITimeOffRequestBuilder timesOff(final String id);

    ITimeOffRequestCollectionRequestBuilder timeOffRequests();

    ITimeOffRequestRequestBuilder timeOffRequests(final String id);

}