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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Constraint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import eu.gateai.gateconnect.client.JSON;

/**
 * LogicalConstraintAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T13:41:35.633205213+03:00[Europe/Sofia]")
public class LogicalConstraintAllOf {
  public static final String SERIALIZED_NAME_IDS_COLON_AND = "ids:and";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_AND)
  private List<Constraint> idsColonAnd;

  public static final String SERIALIZED_NAME_IDS_COLON_XONE = "ids:xone";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_XONE)
  private List<Constraint> idsColonXone;

  public static final String SERIALIZED_NAME_IDS_COLON_OR = "ids:or";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_OR)
  private List<Constraint> idsColonOr;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;

  public LogicalConstraintAllOf() {
  }

  public LogicalConstraintAllOf idsColonAnd(List<Constraint> idsColonAnd) {
    
    this.idsColonAnd = idsColonAnd;
    return this;
  }

  public LogicalConstraintAllOf addIdsColonAndItem(Constraint idsColonAndItem) {
    if (this.idsColonAnd == null) {
      this.idsColonAnd = new ArrayList<>();
    }
    this.idsColonAnd.add(idsColonAndItem);
    return this;
  }

   /**
   * Get idsColonAnd
   * @return idsColonAnd
  **/
  @javax.annotation.Nullable
  public List<Constraint> getIdsColonAnd() {
    return idsColonAnd;
  }


  public void setIdsColonAnd(List<Constraint> idsColonAnd) {
    this.idsColonAnd = idsColonAnd;
  }


  public LogicalConstraintAllOf idsColonXone(List<Constraint> idsColonXone) {
    
    this.idsColonXone = idsColonXone;
    return this;
  }

  public LogicalConstraintAllOf addIdsColonXoneItem(Constraint idsColonXoneItem) {
    if (this.idsColonXone == null) {
      this.idsColonXone = new ArrayList<>();
    }
    this.idsColonXone.add(idsColonXoneItem);
    return this;
  }

   /**
   * Get idsColonXone
   * @return idsColonXone
  **/
  @javax.annotation.Nullable
  public List<Constraint> getIdsColonXone() {
    return idsColonXone;
  }


  public void setIdsColonXone(List<Constraint> idsColonXone) {
    this.idsColonXone = idsColonXone;
  }


  public LogicalConstraintAllOf idsColonOr(List<Constraint> idsColonOr) {
    
    this.idsColonOr = idsColonOr;
    return this;
  }

  public LogicalConstraintAllOf addIdsColonOrItem(Constraint idsColonOrItem) {
    if (this.idsColonOr == null) {
      this.idsColonOr = new ArrayList<>();
    }
    this.idsColonOr.add(idsColonOrItem);
    return this;
  }

   /**
   * Get idsColonOr
   * @return idsColonOr
  **/
  @javax.annotation.Nullable
  public List<Constraint> getIdsColonOr() {
    return idsColonOr;
  }


  public void setIdsColonOr(List<Constraint> idsColonOr) {
    this.idsColonOr = idsColonOr;
  }


  public LogicalConstraintAllOf atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nullable
  public String getAtType() {
    return atType;
  }


  public void setAtType(String atType) {
    this.atType = atType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalConstraintAllOf logicalConstraintAllOf = (LogicalConstraintAllOf) o;
    return Objects.equals(this.idsColonAnd, logicalConstraintAllOf.idsColonAnd) &&
        Objects.equals(this.idsColonXone, logicalConstraintAllOf.idsColonXone) &&
        Objects.equals(this.idsColonOr, logicalConstraintAllOf.idsColonOr) &&
        Objects.equals(this.atType, logicalConstraintAllOf.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idsColonAnd, idsColonXone, idsColonOr, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalConstraintAllOf {\n");
    sb.append("    idsColonAnd: ").append(toIndentedString(idsColonAnd)).append("\n");
    sb.append("    idsColonXone: ").append(toIndentedString(idsColonXone)).append("\n");
    sb.append("    idsColonOr: ").append(toIndentedString(idsColonOr)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ids:and");
    openapiFields.add("ids:xone");
    openapiFields.add("ids:or");
    openapiFields.add("@type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogicalConstraintAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LogicalConstraintAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogicalConstraintAllOf is not found in the empty JSON string", LogicalConstraintAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LogicalConstraintAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogicalConstraintAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ids:and") != null && !jsonObj.get("ids:and").isJsonNull()) {
        JsonArray jsonArrayidsColonAnd = jsonObj.getAsJsonArray("ids:and");
        if (jsonArrayidsColonAnd != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ids:and").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ids:and` to be an array in the JSON string but got `%s`", jsonObj.get("ids:and").toString()));
          }

          // validate the optional field `ids:and` (array)
          for (int i = 0; i < jsonArrayidsColonAnd.size(); i++) {
            Constraint.validateJsonObject(jsonArrayidsColonAnd.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("ids:xone") != null && !jsonObj.get("ids:xone").isJsonNull()) {
        JsonArray jsonArrayidsColonXone = jsonObj.getAsJsonArray("ids:xone");
        if (jsonArrayidsColonXone != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ids:xone").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ids:xone` to be an array in the JSON string but got `%s`", jsonObj.get("ids:xone").toString()));
          }

          // validate the optional field `ids:xone` (array)
          for (int i = 0; i < jsonArrayidsColonXone.size(); i++) {
            Constraint.validateJsonObject(jsonArrayidsColonXone.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("ids:or") != null && !jsonObj.get("ids:or").isJsonNull()) {
        JsonArray jsonArrayidsColonOr = jsonObj.getAsJsonArray("ids:or");
        if (jsonArrayidsColonOr != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ids:or").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ids:or` to be an array in the JSON string but got `%s`", jsonObj.get("ids:or").toString()));
          }

          // validate the optional field `ids:or` (array)
          for (int i = 0; i < jsonArrayidsColonOr.size(); i++) {
            Constraint.validateJsonObject(jsonArrayidsColonOr.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("@type") != null && !jsonObj.get("@type").isJsonNull()) && !jsonObj.get("@type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `@type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("@type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogicalConstraintAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogicalConstraintAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogicalConstraintAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogicalConstraintAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<LogicalConstraintAllOf>() {
           @Override
           public void write(JsonWriter out, LogicalConstraintAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogicalConstraintAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LogicalConstraintAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogicalConstraintAllOf
  * @throws IOException if the JSON string is invalid with respect to LogicalConstraintAllOf
  */
  public static LogicalConstraintAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogicalConstraintAllOf.class);
  }

 /**
  * Convert an instance of LogicalConstraintAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

