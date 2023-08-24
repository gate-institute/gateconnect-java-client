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
 * AppEndpointDescAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T16:01:45.808576329+03:00[Europe/Sofia]")
public class AppEndpointDescAllOf {
  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "endpointType";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private String endpointType;

  public static final String SERIALIZED_NAME_ENDPOINT_PORT = "endpointPort";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_PORT)
  private Integer endpointPort;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public AppEndpointDescAllOf() {
  }

  public AppEndpointDescAllOf endpointType(String endpointType) {
    
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @javax.annotation.Nullable
  public String getEndpointType() {
    return endpointType;
  }


  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }


  public AppEndpointDescAllOf endpointPort(Integer endpointPort) {
    
    this.endpointPort = endpointPort;
    return this;
  }

   /**
   * Get endpointPort
   * @return endpointPort
  **/
  @javax.annotation.Nullable
  public Integer getEndpointPort() {
    return endpointPort;
  }


  public void setEndpointPort(Integer endpointPort) {
    this.endpointPort = endpointPort;
  }


  public AppEndpointDescAllOf mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nullable
  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public AppEndpointDescAllOf protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public AppEndpointDescAllOf language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public AppEndpointDescAllOf path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEndpointDescAllOf appEndpointDescAllOf = (AppEndpointDescAllOf) o;
    return Objects.equals(this.endpointType, appEndpointDescAllOf.endpointType) &&
        Objects.equals(this.endpointPort, appEndpointDescAllOf.endpointPort) &&
        Objects.equals(this.mediaType, appEndpointDescAllOf.mediaType) &&
        Objects.equals(this.protocol, appEndpointDescAllOf.protocol) &&
        Objects.equals(this.language, appEndpointDescAllOf.language) &&
        Objects.equals(this.path, appEndpointDescAllOf.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, endpointPort, mediaType, protocol, language, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEndpointDescAllOf {\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    endpointPort: ").append(toIndentedString(endpointPort)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("endpointType");
    openapiFields.add("endpointPort");
    openapiFields.add("mediaType");
    openapiFields.add("protocol");
    openapiFields.add("language");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppEndpointDescAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppEndpointDescAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppEndpointDescAllOf is not found in the empty JSON string", AppEndpointDescAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppEndpointDescAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppEndpointDescAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("endpointType") != null && !jsonObj.get("endpointType").isJsonNull()) && !jsonObj.get("endpointType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointType").toString()));
      }
      if ((jsonObj.get("mediaType") != null && !jsonObj.get("mediaType").isJsonNull()) && !jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppEndpointDescAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppEndpointDescAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppEndpointDescAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppEndpointDescAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AppEndpointDescAllOf>() {
           @Override
           public void write(JsonWriter out, AppEndpointDescAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppEndpointDescAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppEndpointDescAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppEndpointDescAllOf
  * @throws IOException if the JSON string is invalid with respect to AppEndpointDescAllOf
  */
  public static AppEndpointDescAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppEndpointDescAllOf.class);
  }

 /**
  * Convert an instance of AppEndpointDescAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

