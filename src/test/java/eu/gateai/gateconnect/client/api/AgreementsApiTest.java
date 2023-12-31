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
import org.openapitools.client.model.AgreementView;
import org.openapitools.client.model.PagedModelAgreementView;
import org.openapitools.client.model.PagedModelArtifactView;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgreementsApi
 */
@Disabled
public class AgreementsApiTest {

    private final AgreementsApi api = new AgreementsApi();

    /**
     * Get a base resource by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get16Test() throws ApiException {
        UUID id = null;
        AgreementView response = api.get16(id);
        // TODO: test validations
    }

    /**
     * Get a list of base resources with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAll16Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        PagedModelAgreementView response = api.getAll16(page, size);
        // TODO: test validations
    }

    /**
     * Get all children of a base resource with pagination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResource25Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        PagedModelArtifactView response = api.getResource25(id, page, size);
        // TODO: test validations
    }

}
