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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Constraint;
import org.openapitools.client.model.LogicalConstraint;
import org.openapitools.client.model.RdfResource;
import org.openapitools.client.model.TypedLiteral;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T13:56:16.367272784+03:00[Europe/Sofia]")
public class RuleIdsAssetRefinement extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RuleIdsAssetRefinement.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RuleIdsAssetRefinement.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RuleIdsAssetRefinement' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Constraint> adapterConstraint = gson.getDelegateAdapter(this, TypeToken.get(Constraint.class));
            final TypeAdapter<LogicalConstraint> adapterLogicalConstraint = gson.getDelegateAdapter(this, TypeToken.get(LogicalConstraint.class));

            return (TypeAdapter<T>) new TypeAdapter<RuleIdsAssetRefinement>() {
                @Override
                public void write(JsonWriter out, RuleIdsAssetRefinement value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Constraint`
                    if (value.getActualInstance() instanceof Constraint) {
                        JsonObject obj = adapterConstraint.toJsonTree((Constraint)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `LogicalConstraint`
                    if (value.getActualInstance() instanceof LogicalConstraint) {
                        JsonObject obj = adapterLogicalConstraint.toJsonTree((LogicalConstraint)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Constraint, LogicalConstraint");
                }

                @Override
                public RuleIdsAssetRefinement read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Constraint
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Constraint.validateJsonObject(jsonObject);
                        actualAdapter = adapterConstraint;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Constraint'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Constraint failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Constraint'", e);
                    }

                    // deserialize LogicalConstraint
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LogicalConstraint.validateJsonObject(jsonObject);
                        actualAdapter = adapterLogicalConstraint;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LogicalConstraint'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LogicalConstraint failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LogicalConstraint'", e);
                    }

                    if (match == 1) {
                        RuleIdsAssetRefinement ret = new RuleIdsAssetRefinement();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RuleIdsAssetRefinement: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RuleIdsAssetRefinement() {
        super("oneOf", Boolean.FALSE);
    }

    public RuleIdsAssetRefinement(Constraint o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RuleIdsAssetRefinement(LogicalConstraint o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Constraint", new GenericType<Constraint>() {
        });
        schemas.put("LogicalConstraint", new GenericType<LogicalConstraint>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RuleIdsAssetRefinement.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Constraint, LogicalConstraint
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Constraint) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LogicalConstraint) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Constraint, LogicalConstraint");
    }

    /**
     * Get the actual instance, which can be the following:
     * Constraint, LogicalConstraint
     *
     * @return The actual instance (Constraint, LogicalConstraint)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Constraint`. If the actual instance is not `Constraint`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Constraint`
     * @throws ClassCastException if the instance is not `Constraint`
     */
    public Constraint getConstraint() throws ClassCastException {
        return (Constraint)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LogicalConstraint`. If the actual instance is not `LogicalConstraint`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LogicalConstraint`
     * @throws ClassCastException if the instance is not `LogicalConstraint`
     */
    public LogicalConstraint getLogicalConstraint() throws ClassCastException {
        return (LogicalConstraint)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RuleIdsAssetRefinement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with Constraint
    try {
      Constraint.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Constraint failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LogicalConstraint
    try {
      LogicalConstraint.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LogicalConstraint failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RuleIdsAssetRefinement with oneOf schemas: Constraint, LogicalConstraint. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of RuleIdsAssetRefinement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuleIdsAssetRefinement
  * @throws IOException if the JSON string is invalid with respect to RuleIdsAssetRefinement
  */
  public static RuleIdsAssetRefinement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleIdsAssetRefinement.class);
  }

 /**
  * Convert an instance of RuleIdsAssetRefinement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

