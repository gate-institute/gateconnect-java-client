/*
 * Dataspace Connector
 * IDS Connector reference implementation
 *
 * The version of the OpenAPI document: 8.0.2
 * Contact: support@sovity.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.gateai.gateconnect.client.api;

import eu.gateai.gateconnect.client.ApiException;
import org.openapitools.client.model.AppStoreDesc;
import org.openapitools.client.model.AppStoreView;
import org.openapitools.client.model.PagedModelAppStoreView;
import org.openapitools.client.model.PagedModelAppView;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppStoresApi
 */
@Disabled
public class AppStoresApiTest {

    private final AppStoresApi api = new AppStoresApi();

    /**
     * Create a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void create13Test() throws ApiException {
        AppStoreDesc appStoreDesc = null;
        AppStoreView response = api.create13(appStoreDesc);
        // TODO: test validations
    }

    /**
     * Delete a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void delete14Test() throws ApiException {
        UUID id = null;
        api.delete14(id);
        // TODO: test validations
    }

    /**
     * Get a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get14Test() throws ApiException {
        UUID id = null;
        AppStoreView response = api.get14(id);
        // TODO: test validations
    }

    /**
     * Get a list of base resources with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAll14Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        PagedModelAppStoreView response = api.getAll14(page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource23Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelAppView response = api.getResource23(id, page, size);
        // TODO: test validations
    }

    /**
     * Update a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void update14Test() throws ApiException {
        UUID id = null;
        AppStoreDesc appStoreDesc = null;
        AppStoreView response = api.update14(id, appStoreDesc);
        // TODO: test validations
    }

}
