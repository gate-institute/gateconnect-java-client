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
import org.openapitools.client.model.PagedModelArtifactView;
import org.openapitools.client.model.PagedModelOfferedResourceView;
import org.openapitools.client.model.PagedModelRepresentationView;
import org.openapitools.client.model.PagedModelRequestedResourceView;
import org.openapitools.client.model.PagedModelSubscriptionView;
import org.openapitools.client.model.RepresentationDesc;
import org.openapitools.client.model.RepresentationView;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RepresentationsApi
 */
@Disabled
public class RepresentationsApiTest {

    private final RepresentationsApi api = new RepresentationsApi();

    /**
     * Add a list of children to a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addResources4Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        PagedModelRequestedResourceView response = api.addResources4(id, URI);
        // TODO: test validations
    }

    /**
     * Add a list of children to a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addResources5Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        PagedModelOfferedResourceView response = api.addResources5(id, URI);
        // TODO: test validations
    }

    /**
     * Add a list of children to a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addResources6Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        PagedModelArtifactView response = api.addResources6(id, URI);
        // TODO: test validations
    }

    /**
     * Create a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void create3Test() throws ApiException {
        RepresentationDesc representationDesc = null;
        RepresentationView response = api.create3(representationDesc);
        // TODO: test validations
    }

    /**
     * Delete a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void delete4Test() throws ApiException {
        UUID id = null;
        api.delete4(id);
        // TODO: test validations
    }

    /**
     * Get a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get4Test() throws ApiException {
        UUID id = null;
        RepresentationView response = api.get4(id);
        // TODO: test validations
    }

    /**
     * Get a list of base resources with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAll4Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        PagedModelRepresentationView response = api.getAll4(page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource6Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelSubscriptionView response = api.getResource6(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource7Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelRequestedResourceView response = api.getResource7(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource8Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelOfferedResourceView response = api.getResource8(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource9Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelArtifactView response = api.getResource9(id, page, size);
        // TODO: test validations
    }

    /**
     * Remove a list of children from a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeResources4Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.removeResources4(id, URI);
        // TODO: test validations
    }

    /**
     * Remove a list of children from a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeResources5Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.removeResources5(id, URI);
        // TODO: test validations
    }

    /**
     * Remove a list of children from a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeResources6Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.removeResources6(id, URI);
        // TODO: test validations
    }

    /**
     * Replace the children of a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceResources4Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.replaceResources4(id, URI);
        // TODO: test validations
    }

    /**
     * Replace the children of a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceResources5Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.replaceResources5(id, URI);
        // TODO: test validations
    }

    /**
     * Replace the children of a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceResources6Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.replaceResources6(id, URI);
        // TODO: test validations
    }

    /**
     * Update a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void update4Test() throws ApiException {
        UUID id = null;
        RepresentationDesc representationDesc = null;
        RepresentationView response = api.update4(id, representationDesc);
        // TODO: test validations
    }

}