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
import org.openapitools.client.model.AddRoutesRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutesApacheCamelApi
 */
@Disabled
public class RoutesApacheCamelApiTest {

    private final RoutesApacheCamelApi api = new RoutesApacheCamelApi();

    /**
     * Add a bean to the application context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBeansTest() throws ApiException {
        AddRoutesRequest addRoutesRequest = null;
        Object response = api.addBeans(addRoutesRequest);
        // TODO: test validations
    }

    /**
     * Add a route to the Camel context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addRoutesTest() throws ApiException {
        AddRoutesRequest addRoutesRequest = null;
        Object response = api.addRoutes(addRoutesRequest);
        // TODO: test validations
    }

    /**
     * Get new route related errors.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRouteErrorsTest() throws ApiException {
        Object response = api.getRouteErrors();
        // TODO: test validations
    }

    /**
     * Remove a bean from the application context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeBeanTest() throws ApiException {
        String beanId = null;
        Object response = api.removeBean(beanId);
        // TODO: test validations
    }

    /**
     * Delete a route from the Camel context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRouteTest() throws ApiException {
        String routeId = null;
        Object response = api.removeRoute(routeId);
        // TODO: test validations
    }

}