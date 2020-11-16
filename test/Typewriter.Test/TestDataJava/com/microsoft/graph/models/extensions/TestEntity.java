// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TestType;
import com.microsoft.graph.models.extensions.EntityType2;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Entity.
 */
public class TestEntity extends Entity implements IJsonBackedObject {


    /**
     * The Test Nav.
     * 
     */
    @SerializedName(value = "testNav", alternate = {"TestNav"})
    @Expose
	@Nullable
    public TestType testNav;

    /**
     * The Test Invalid Nav.
     * 
     */
    @SerializedName(value = "testInvalidNav", alternate = {"TestInvalidNav"})
    @Expose
	@Nullable
    public EntityType2 testInvalidNav;

    /**
     * The Test Explicit Nav.
     * 
     */
    @SerializedName(value = "testExplicitNav", alternate = {"TestExplicitNav"})
    @Expose
	@Nullable
    public EntityType3 testExplicitNav;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
