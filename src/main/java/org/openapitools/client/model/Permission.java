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
import org.openapitools.client.model.Duty;
import org.openapitools.client.model.Rule;
import org.openapitools.client.model.RuleIdsAssetRefinement;
import org.openapitools.client.model.RuleIdsConstraintInner;
import org.openapitools.client.model.TypedLiteral;

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
 * Permission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:13:44.561612454+03:00[Europe/Sofia]")
public class Permission extends Rule {
  public static final String SERIALIZED_NAME_IDS_COLON_POST_DUTY = "ids:postDuty";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_POST_DUTY)
  private List<Duty> idsColonPostDuty;

  public static final String SERIALIZED_NAME_IDS_COLON_PRE_DUTY = "ids:preDuty";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_PRE_DUTY)
  private List<Duty> idsColonPreDuty;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  protected String atType;

  public Permission() {
    this.atType = this.getClass().getSimpleName();
  }

  public Permission idsColonPostDuty(List<Duty> idsColonPostDuty) {
    
    this.idsColonPostDuty = idsColonPostDuty;
    return this;
  }

  public Permission addIdsColonPostDutyItem(Duty idsColonPostDutyItem) {
    if (this.idsColonPostDuty == null) {
      this.idsColonPostDuty = new ArrayList<>();
    }
    this.idsColonPostDuty.add(idsColonPostDutyItem);
    return this;
  }

   /**
   * Get idsColonPostDuty
   * @return idsColonPostDuty
  **/
  @javax.annotation.Nullable
  public List<Duty> getIdsColonPostDuty() {
    return idsColonPostDuty;
  }


  public void setIdsColonPostDuty(List<Duty> idsColonPostDuty) {
    this.idsColonPostDuty = idsColonPostDuty;
  }


  public Permission idsColonPreDuty(List<Duty> idsColonPreDuty) {
    
    this.idsColonPreDuty = idsColonPreDuty;
    return this;
  }

  public Permission addIdsColonPreDutyItem(Duty idsColonPreDutyItem) {
    if (this.idsColonPreDuty == null) {
      this.idsColonPreDuty = new ArrayList<>();
    }
    this.idsColonPreDuty.add(idsColonPreDutyItem);
    return this;
  }

   /**
   * Get idsColonPreDuty
   * @return idsColonPreDuty
  **/
  @javax.annotation.Nullable
  public List<Duty> getIdsColonPreDuty() {
    return idsColonPreDuty;
  }


  public void setIdsColonPreDuty(List<Duty> idsColonPreDuty) {
    this.idsColonPreDuty = idsColonPreDuty;
  }


  public Permission atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nonnull
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
    Permission permission = (Permission) o;
    return Objects.equals(this.idsColonPostDuty, permission.idsColonPostDuty) &&
        Objects.equals(this.idsColonPreDuty, permission.idsColonPreDuty) &&
        Objects.equals(this.atType, permission.atType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idsColonPostDuty, idsColonPreDuty, atType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    idsColonPostDuty: ").append(toIndentedString(idsColonPostDuty)).append("\n");
    sb.append("    idsColonPreDuty: ").append(toIndentedString(idsColonPreDuty)).append("\n");
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
    openapiFields.add("properties");
    openapiFields.add("comment");
    openapiFields.add("label");
    openapiFields.add("ids:target");
    openapiFields.add("ids:assigner");
    openapiFields.add("ids:assignee");
    openapiFields.add("ids:constraint");
    openapiFields.add("ids:assetRefinement");
    openapiFields.add("ids:action");
    openapiFields.add("ids:description");
    openapiFields.add("ids:title");
    openapiFields.add("@id");
    openapiFields.add("@type");
    openapiFields.add("ids:postDuty");
    openapiFields.add("ids:preDuty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("@type");
    openapiRequiredFields.add("ids:action");
    openapiRequiredFields.add("@id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Permission
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Permission.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Permission is not found in the empty JSON string", Permission.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Permission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Permission` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Permission.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Permission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Permission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Permission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Permission.class));

       return (TypeAdapter<T>) new TypeAdapter<Permission>() {
           @Override
           public void write(JsonWriter out, Permission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Permission read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Permission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Permission
  * @throws IOException if the JSON string is invalid with respect to Permission
  */
  public static Permission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Permission.class);
  }

 /**
  * Convert an instance of Permission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

