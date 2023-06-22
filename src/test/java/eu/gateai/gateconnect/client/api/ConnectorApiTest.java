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
import org.openapitools.client.model.RepresentationModelObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectorApi
 */
@Disabled
public class ConnectorApiTest {

    private final ConnectorApi api = new ConnectorApi();

    /**
     * Get the private IDS self-description.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPrivateSelfDescriptionTest() throws ApiException {
        Object response = api.getPrivateSelfDescription();
        // TODO: test validations
    }

    /**
     * Get the public IDS self-description.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPublicSelfDescription1Test() throws ApiException {
        Object response = api.getPublicSelfDescription1();
        // TODO: test validations
    }

    /**
     * Entrypoint for REST resources
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rootTest() throws ApiException {
        RepresentationModelObject response = api.root();
        // TODO: test validations
    }

}
