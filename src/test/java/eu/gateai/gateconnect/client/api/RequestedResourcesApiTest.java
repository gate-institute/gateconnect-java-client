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
import org.openapitools.client.model.PagedModelCatalogView;
import org.openapitools.client.model.PagedModelContractView;
import org.openapitools.client.model.PagedModelRepresentationView;
import org.openapitools.client.model.PagedModelRequestedResourceView;
import org.openapitools.client.model.PagedModelSubscriptionView;
import org.openapitools.client.model.RequestedResourceDesc;
import org.openapitools.client.model.RequestedResourceView;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RequestedResourcesApi
 */
@Disabled
public class RequestedResourcesApiTest {

    private final RequestedResourcesApi api = new RequestedResourcesApi();

    /**
     * Add a list of children to a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addResources2Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        PagedModelRepresentationView response = api.addResources2(id, URI);
        // TODO: test validations
    }

    /**
     * Add a list of children to a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addResources3Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        PagedModelCatalogView response = api.addResources3(id, URI);
        // TODO: test validations
    }

    /**
     * Delete a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void delete3Test() throws ApiException {
        UUID id = null;
        api.delete3(id);
        // TODO: test validations
    }

    /**
     * Get a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get3Test() throws ApiException {
        UUID id = null;
        RequestedResourceView response = api.get3(id);
        // TODO: test validations
    }

    /**
     * Get a list of base resources with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAll3Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        PagedModelRequestedResourceView response = api.getAll3(page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource2Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelSubscriptionView response = api.getResource2(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource3Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelRepresentationView response = api.getResource3(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource4Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelContractView response = api.getResource4(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource5Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelCatalogView response = api.getResource5(id, page, size);
        // TODO: test validations
    }

    /**
     * Remove a list of children from a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeResources2Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.removeResources2(id, URI);
        // TODO: test validations
    }

    /**
     * Remove a list of children from a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeResources3Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.removeResources3(id, URI);
        // TODO: test validations
    }

    /**
     * Replace the children of a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceResources2Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.replaceResources2(id, URI);
        // TODO: test validations
    }

    /**
     * Replace the children of a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceResources3Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.replaceResources3(id, URI);
        // TODO: test validations
    }

    /**
     * Update a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void update3Test() throws ApiException {
        UUID id = null;
        RequestedResourceDesc requestedResourceDesc = null;
        RequestedResourceView response = api.update3(id, requestedResourceDesc);
        // TODO: test validations
    }

}
