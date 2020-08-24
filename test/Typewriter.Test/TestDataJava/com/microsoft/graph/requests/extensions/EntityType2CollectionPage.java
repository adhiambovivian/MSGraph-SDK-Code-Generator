// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EntityType2;
import com.microsoft.graph.requests.extensions.IEntityType2CollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type2Collection Page.
 */
public class EntityType2CollectionPage extends BaseCollectionPage<EntityType2, IEntityType2CollectionRequestBuilder> implements IEntityType2CollectionPage {

    /**
     * A collection page for EntityType2
     *
     * @param response the serialized EntityType2CollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EntityType2CollectionPage(final EntityType2CollectionResponse response, final IEntityType2CollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
