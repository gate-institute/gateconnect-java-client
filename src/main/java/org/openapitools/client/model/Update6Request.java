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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import org.openapitools.client.model.AppEndpointDesc;
import org.openapitools.client.model.EndpointDesc;
import org.openapitools.client.model.GenericEndpointDesc;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import eu.gateai.gateconnect.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T13:41:35.633205213+03:00[Europe/Sofia]")
public class Update6Request extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Update6Request.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Update6Request.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Update6Request' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AppEndpointDesc> adapterAppEndpointDesc = gson.getDelegateAdapter(this, TypeToken.get(AppEndpointDesc.class));
            final TypeAdapter<EndpointDesc> adapterEndpointDesc = gson.getDelegateAdapter(this, TypeToken.get(EndpointDesc.class));
            final TypeAdapter<GenericEndpointDesc> adapterGenericEndpointDesc = gson.getDelegateAdapter(this, TypeToken.get(GenericEndpointDesc.class));

            return (TypeAdapter<T>) new TypeAdapter<Update6Request>() {
                @Override
                public void write(JsonWriter out, Update6Request value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AppEndpointDesc`
                    if (value.getActualInstance() instanceof AppEndpointDesc) {
                        JsonObject obj = adapterAppEndpointDesc.toJsonTree((AppEndpointDesc)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EndpointDesc`
                    if (value.getActualInstance() instanceof EndpointDesc) {
                        JsonObject obj = adapterEndpointDesc.toJsonTree((EndpointDesc)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GenericEndpointDesc`
                    if (value.getActualInstance() instanceof GenericEndpointDesc) {
                        JsonObject obj = adapterGenericEndpointDesc.toJsonTree((GenericEndpointDesc)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AppEndpointDesc, EndpointDesc, GenericEndpointDesc");
                }

                @Override
                public Update6Request read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AppEndpointDesc
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AppEndpointDesc.validateJsonObject(jsonObject);
                        actualAdapter = adapterAppEndpointDesc;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AppEndpointDesc'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AppEndpointDesc failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AppEndpointDesc'", e);
                    }

                    // deserialize EndpointDesc
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EndpointDesc.validateJsonObject(jsonObject);
                        actualAdapter = adapterEndpointDesc;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EndpointDesc'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EndpointDesc failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EndpointDesc'", e);
                    }

                    // deserialize GenericEndpointDesc
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GenericEndpointDesc.validateJsonObject(jsonObject);
                        actualAdapter = adapterGenericEndpointDesc;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GenericEndpointDesc'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GenericEndpointDesc failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GenericEndpointDesc'", e);
                    }

                    if (match == 1) {
                        Update6Request ret = new Update6Request();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Update6Request: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Update6Request() {
        super("oneOf", Boolean.FALSE);
    }

    public Update6Request(AppEndpointDesc o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Update6Request(EndpointDesc o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Update6Request(GenericEndpointDesc o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppEndpointDesc", new GenericType<AppEndpointDesc>() {
        });
        schemas.put("EndpointDesc", new GenericType<EndpointDesc>() {
        });
        schemas.put("GenericEndpointDesc", new GenericType<GenericEndpointDesc>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Update6Request.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppEndpointDesc, EndpointDesc, GenericEndpointDesc
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AppEndpointDesc) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EndpointDesc) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GenericEndpointDesc) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppEndpointDesc, EndpointDesc, GenericEndpointDesc");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppEndpointDesc, EndpointDesc, GenericEndpointDesc
     *
     * @return The actual instance (AppEndpointDesc, EndpointDesc, GenericEndpointDesc)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppEndpointDesc`. If the actual instance is not `AppEndpointDesc`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppEndpointDesc`
     * @throws ClassCastException if the instance is not `AppEndpointDesc`
     */
    public AppEndpointDesc getAppEndpointDesc() throws ClassCastException {
        return (AppEndpointDesc)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointDesc`. If the actual instance is not `EndpointDesc`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointDesc`
     * @throws ClassCastException if the instance is not `EndpointDesc`
     */
    public EndpointDesc getEndpointDesc() throws ClassCastException {
        return (EndpointDesc)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GenericEndpointDesc`. If the actual instance is not `GenericEndpointDesc`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GenericEndpointDesc`
     * @throws ClassCastException if the instance is not `GenericEndpointDesc`
     */
    public GenericEndpointDesc getGenericEndpointDesc() throws ClassCastException {
        return (GenericEndpointDesc)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Update6Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AppEndpointDesc
    try {
      AppEndpointDesc.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AppEndpointDesc failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EndpointDesc
    try {
      EndpointDesc.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EndpointDesc failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GenericEndpointDesc
    try {
      GenericEndpointDesc.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GenericEndpointDesc failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Update6Request with oneOf schemas: AppEndpointDesc, EndpointDesc, GenericEndpointDesc. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of Update6Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Update6Request
  * @throws IOException if the JSON string is invalid with respect to Update6Request
  */
  public static Update6Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Update6Request.class);
  }

 /**
  * Convert an instance of Update6Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

