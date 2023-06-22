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
 * RepresentationView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T13:41:35.633205213+03:00[Europe/Sofia]")
public class RepresentationView {
  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modificationDate";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remoteId";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private URI remoteId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_ADDITIONAL = "additional";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL)
  private Map<String, String> additional = new HashMap<>();

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = new HashMap<>();

  public RepresentationView() {
  }

  public RepresentationView creationDate(OffsetDateTime creationDate) {
    
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


  public RepresentationView modificationDate(OffsetDateTime modificationDate) {
    
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


  public RepresentationView remoteId(URI remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Get remoteId
   * @return remoteId
  **/
  @javax.annotation.Nullable
  public URI getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(URI remoteId) {
    this.remoteId = remoteId;
  }


  public RepresentationView title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RepresentationView description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RepresentationView mediaType(String mediaType) {
    
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


  public RepresentationView language(String language) {
    
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


  public RepresentationView additional(Map<String, String> additional) {
    
    this.additional = additional;
    return this;
  }

  public RepresentationView putAdditionalItem(String key, String additionalItem) {
    if (this.additional == null) {
      this.additional = new HashMap<>();
    }
    this.additional.put(key, additionalItem);
    return this;
  }

   /**
   * Get additional
   * @return additional
  **/
  @javax.annotation.Nullable
  public Map<String, String> getAdditional() {
    return additional;
  }


  public void setAdditional(Map<String, String> additional) {
    this.additional = additional;
  }


  public RepresentationView links(Map<String, Link> links) {
    
    this.links = links;
    return this;
  }

  public RepresentationView putLinksItem(String key, Link linksItem) {
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
    RepresentationView representationView = (RepresentationView) o;
    return Objects.equals(this.creationDate, representationView.creationDate) &&
        Objects.equals(this.modificationDate, representationView.modificationDate) &&
        Objects.equals(this.remoteId, representationView.remoteId) &&
        Objects.equals(this.title, representationView.title) &&
        Objects.equals(this.description, representationView.description) &&
        Objects.equals(this.mediaType, representationView.mediaType) &&
        Objects.equals(this.language, representationView.language) &&
        Objects.equals(this.additional, representationView.additional) &&
        Objects.equals(this.links, representationView.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, modificationDate, remoteId, title, description, mediaType, language, additional, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentationView {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
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
    openapiFields.add("creationDate");
    openapiFields.add("modificationDate");
    openapiFields.add("remoteId");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("mediaType");
    openapiFields.add("language");
    openapiFields.add("additional");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepresentationView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RepresentationView.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepresentationView is not found in the empty JSON string", RepresentationView.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepresentationView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepresentationView` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("remoteId") != null && !jsonObj.get("remoteId").isJsonNull()) && !jsonObj.get("remoteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteId").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("mediaType") != null && !jsonObj.get("mediaType").isJsonNull()) && !jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepresentationView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepresentationView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepresentationView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepresentationView.class));

       return (TypeAdapter<T>) new TypeAdapter<RepresentationView>() {
           @Override
           public void write(JsonWriter out, RepresentationView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepresentationView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepresentationView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepresentationView
  * @throws IOException if the JSON string is invalid with respect to RepresentationView
  */
  public static RepresentationView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepresentationView.class);
  }

 /**
  * Convert an instance of RepresentationView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

