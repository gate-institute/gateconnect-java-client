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
import org.openapitools.client.model.AppEndpointView;

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
 * PagedModelAppEndpointViewEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T16:01:45.808576329+03:00[Europe/Sofia]")
public class PagedModelAppEndpointViewEmbedded {
  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<AppEndpointView> endpoints;

  public PagedModelAppEndpointViewEmbedded() {
  }

  public PagedModelAppEndpointViewEmbedded endpoints(List<AppEndpointView> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public PagedModelAppEndpointViewEmbedded addEndpointsItem(AppEndpointView endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @javax.annotation.Nullable
  public List<AppEndpointView> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<AppEndpointView> endpoints) {
    this.endpoints = endpoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelAppEndpointViewEmbedded pagedModelAppEndpointViewEmbedded = (PagedModelAppEndpointViewEmbedded) o;
    return Objects.equals(this.endpoints, pagedModelAppEndpointViewEmbedded.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelAppEndpointViewEmbedded {\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
    openapiFields.add("endpoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagedModelAppEndpointViewEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagedModelAppEndpointViewEmbedded.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedModelAppEndpointViewEmbedded is not found in the empty JSON string", PagedModelAppEndpointViewEmbedded.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PagedModelAppEndpointViewEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagedModelAppEndpointViewEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("endpoints") != null && !jsonObj.get("endpoints").isJsonNull()) {
        JsonArray jsonArrayendpoints = jsonObj.getAsJsonArray("endpoints");
        if (jsonArrayendpoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endpoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endpoints` to be an array in the JSON string but got `%s`", jsonObj.get("endpoints").toString()));
          }

          // validate the optional field `endpoints` (array)
          for (int i = 0; i < jsonArrayendpoints.size(); i++) {
            AppEndpointView.validateJsonObject(jsonArrayendpoints.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagedModelAppEndpointViewEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedModelAppEndpointViewEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedModelAppEndpointViewEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedModelAppEndpointViewEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedModelAppEndpointViewEmbedded>() {
           @Override
           public void write(JsonWriter out, PagedModelAppEndpointViewEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagedModelAppEndpointViewEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagedModelAppEndpointViewEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagedModelAppEndpointViewEmbedded
  * @throws IOException if the JSON string is invalid with respect to PagedModelAppEndpointViewEmbedded
  */
  public static PagedModelAppEndpointViewEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedModelAppEndpointViewEmbedded.class);
  }

 /**
  * Convert an instance of PagedModelAppEndpointViewEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

