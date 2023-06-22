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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Link;

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
 * AppEndpointView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T13:41:35.633205213+03:00[Europe/Sofia]")
public class AppEndpointView {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    APP("App"),
    
    CONNECTOR("Connector"),
    
    GENERIC("Generic");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modificationDate";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "endpointType";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private String endpointType;

  public static final String SERIALIZED_NAME_DOCS = "docs";
  @SerializedName(SERIALIZED_NAME_DOCS)
  private URI docs;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

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

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = new HashMap<>();

  public AppEndpointView() {
  }

  public AppEndpointView type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AppEndpointView creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public AppEndpointView modificationDate(OffsetDateTime modificationDate) {
    
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }


  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }


  public AppEndpointView location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public AppEndpointView endpointType(String endpointType) {
    
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


  public AppEndpointView docs(URI docs) {
    
    this.docs = docs;
    return this;
  }

   /**
   * Get docs
   * @return docs
  **/
  @javax.annotation.Nullable
  public URI getDocs() {
    return docs;
  }


  public void setDocs(URI docs) {
    this.docs = docs;
  }


  public AppEndpointView info(String info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  public String getInfo() {
    return info;
  }


  public void setInfo(String info) {
    this.info = info;
  }


  public AppEndpointView endpointPort(Integer endpointPort) {
    
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


  public AppEndpointView mediaType(String mediaType) {
    
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


  public AppEndpointView protocol(String protocol) {
    
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


  public AppEndpointView language(String language) {
    
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


  public AppEndpointView path(String path) {
    
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


  public AppEndpointView links(Map<String, Link> links) {
    
    this.links = links;
    return this;
  }

  public AppEndpointView putLinksItem(String key, Link linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public Map<String, Link> getLinks() {
    return links;
  }


  public void setLinks(Map<String, Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEndpointView appEndpointView = (AppEndpointView) o;
    return Objects.equals(this.type, appEndpointView.type) &&
        Objects.equals(this.creationDate, appEndpointView.creationDate) &&
        Objects.equals(this.modificationDate, appEndpointView.modificationDate) &&
        Objects.equals(this.location, appEndpointView.location) &&
        Objects.equals(this.endpointType, appEndpointView.endpointType) &&
        Objects.equals(this.docs, appEndpointView.docs) &&
        Objects.equals(this.info, appEndpointView.info) &&
        Objects.equals(this.endpointPort, appEndpointView.endpointPort) &&
        Objects.equals(this.mediaType, appEndpointView.mediaType) &&
        Objects.equals(this.protocol, appEndpointView.protocol) &&
        Objects.equals(this.language, appEndpointView.language) &&
        Objects.equals(this.path, appEndpointView.path) &&
        Objects.equals(this.links, appEndpointView.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, creationDate, modificationDate, location, endpointType, docs, info, endpointPort, mediaType, protocol, language, path, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEndpointView {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    endpointPort: ").append(toIndentedString(endpointPort)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("creationDate");
    openapiFields.add("modificationDate");
    openapiFields.add("location");
    openapiFields.add("endpointType");
    openapiFields.add("docs");
    openapiFields.add("info");
    openapiFields.add("endpointPort");
    openapiFields.add("mediaType");
    openapiFields.add("protocol");
    openapiFields.add("language");
    openapiFields.add("path");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppEndpointView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppEndpointView.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppEndpointView is not found in the empty JSON string", AppEndpointView.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppEndpointView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppEndpointView` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("endpointType") != null && !jsonObj.get("endpointType").isJsonNull()) && !jsonObj.get("endpointType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointType").toString()));
      }
      if ((jsonObj.get("docs") != null && !jsonObj.get("docs").isJsonNull()) && !jsonObj.get("docs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docs").toString()));
      }
      if ((jsonObj.get("info") != null && !jsonObj.get("info").isJsonNull()) && !jsonObj.get("info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("info").toString()));
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
       if (!AppEndpointView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppEndpointView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppEndpointView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppEndpointView.class));

       return (TypeAdapter<T>) new TypeAdapter<AppEndpointView>() {
           @Override
           public void write(JsonWriter out, AppEndpointView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppEndpointView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppEndpointView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppEndpointView
  * @throws IOException if the JSON string is invalid with respect to AppEndpointView
  */
  public static AppEndpointView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppEndpointView.class);
  }

 /**
  * Convert an instance of AppEndpointView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
