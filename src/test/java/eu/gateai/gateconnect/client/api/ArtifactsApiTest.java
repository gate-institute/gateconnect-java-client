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
import org.openapitools.client.model.ArtifactDesc;
import org.openapitools.client.model.ArtifactView;
import org.openapitools.client.model.PagedModelAgreementView;
import org.openapitools.client.model.PagedModelArtifactView;
import org.openapitools.client.model.PagedModelRepresentationView;
import org.openapitools.client.model.PagedModelSubscriptionView;
import org.openapitools.client.model.PutDataRequest;
import org.openapitools.client.model.RouteView;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArtifactsApi
 */
@Disabled
public class ArtifactsApiTest {

    private final ArtifactsApi api = new ArtifactsApi();

    /**
     * Add a list of children to a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addResources13Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        PagedModelRepresentationView response = api.addResources13(id, URI);
        // TODO: test validations
    }

    /**
     * Create a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void create12Test() throws ApiException {
        ArtifactDesc artifactDesc = null;
        ArtifactView response = api.create12(artifactDesc);
        // TODO: test validations
    }

    /**
     * Delete a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void delete13Test() throws ApiException {
        UUID id = null;
        api.delete13(id);
        // TODO: test validations
    }

    /**
     * Get a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get13Test() throws ApiException {
        UUID id = null;
        ArtifactView response = api.get13(id);
        // TODO: test validations
    }

    /**
     * Get a list of base resources with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAll13Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        PagedModelArtifactView response = api.getAll13(page, size);
        // TODO: test validations
    }

    /**
     * Get data by artifact id with query input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataTest() throws ApiException {
        UUID id = null;
        List<URI> routeIds = null;
        List<URI> URI = null;
        Object response = api.getData(id, routeIds, URI);
        // TODO: test validations
    }

    /**
     * Get data by artifact id with query input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getData1Test() throws ApiException {
        UUID id = null;
        Boolean download = null;
        URI agreementUri = null;
        List<URI> routeIds = null;
        Object response = api.getData1(id, download, agreementUri, routeIds);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource20Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelSubscriptionView response = api.getResource20(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource21Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelRepresentationView response = api.getResource21(id, page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource22Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelAgreementView response = api.getResource22(id, page, size);
        // TODO: test validations
    }

    /**
     * Get route associated with artifact by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRouteTest() throws ApiException {
        UUID id = null;
        RouteView response = api.getRoute(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putDataTest() throws ApiException {
        UUID id = null;
        PutDataRequest putDataRequest = null;
        api.putData(id, putDataRequest);
        // TODO: test validations
    }

    /**
     * Remove a list of children from a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeResources13Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.removeResources13(id, URI);
        // TODO: test validations
    }

    /**
     * Replace the children of a base resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceResources13Test() throws ApiException {
        UUID id = null;
        List<URI> URI = null;
        api.replaceResources13(id, URI);
        // TODO: test validations
    }

    /**
     * Update a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void update13Test() throws ApiException {
        UUID id = null;
        ArtifactDesc artifactDesc = null;
        ArtifactView response = api.update13(id, artifactDesc);
        // TODO: test validations
    }

}
