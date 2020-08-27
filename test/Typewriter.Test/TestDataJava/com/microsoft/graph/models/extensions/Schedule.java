// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TimeOff;
import com.microsoft.graph.models.extensions.TimeOffRequest;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TimeOffCollectionResponse;
import com.microsoft.graph.requests.extensions.TimeOffCollectionPage;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule.
 */
public class Schedule extends Entity implements IJsonBackedObject {


    /**
     * The Enabled.
     * 
     */
    @SerializedName("enabled")
    @Expose
    public Boolean enabled;

    /**
     * The Times Off.
     * 
     */
    public TimeOffCollectionPage timesOff;

    /**
     * The Time Off Requests.
     * 
     */
    public TimeOffRequestCollectionPage timeOffRequests;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("timesOff")) {
            final TimeOffCollectionResponse response = new TimeOffCollectionResponse();
            if (json.has("timesOff@odata.nextLink")) {
                response.nextLink = json.get("timesOff@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("timesOff").toString(), JsonObject[].class);
            final TimeOff[] array = new TimeOff[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TimeOff.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            timesOff = new TimeOffCollectionPage(response, null);
        }

        if (json.has("timeOffRequests")) {
            final TimeOffRequestCollectionResponse response = new TimeOffRequestCollectionResponse();
            if (json.has("timeOffRequests@odata.nextLink")) {
                response.nextLink = json.get("timeOffRequests@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("timeOffRequests").toString(), JsonObject[].class);
            final TimeOffRequest[] array = new TimeOffRequest[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TimeOffRequest.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            timeOffRequests = new TimeOffRequestCollectionPage(response, null);
        }
    }
}
