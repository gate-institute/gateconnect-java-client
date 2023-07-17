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
import java.util.UUID;

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
 * Endpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T13:56:16.367272784+03:00[Europe/Sofia]")
public class Endpoint {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modificationDate";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_ADDITIONAL = "additional";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL)
  private Map<String, String> additional = new HashMap<>();

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_BOOTSTRAP_ID = "bootstrapId";
  @SerializedName(SERIALIZED_NAME_BOOTSTRAP_ID)
  private URI bootstrapId;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_DOCS = "docs";
  @SerializedName(SERIALIZED_NAME_DOCS)
  private URI docs;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Endpoint() {
  }

  public Endpoint id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Endpoint creationDate(OffsetDateTime creationDate) {
    
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


  public Endpoint modificationDate(OffsetDateTime modificationDate) {
    
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


  public Endpoint additional(Map<String, String> additional) {
    
    this.additional = additional;
    return this;
  }

  public Endpoint putAdditionalItem(String key, String additionalItem) {
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


  public Endpoint deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Endpoint bootstrapId(URI bootstrapId) {
    
    this.bootstrapId = bootstrapId;
    return this;
  }

   /**
   * Get bootstrapId
   * @return bootstrapId
  **/
  @javax.annotation.Nullable
  public URI getBootstrapId() {
    return bootstrapId;
  }


  public void setBootstrapId(URI bootstrapId) {
    this.bootstrapId = bootstrapId;
  }


  public Endpoint location(String location) {
    
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


  public Endpoint docs(URI docs) {
    
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


  public Endpoint info(String info) {
    
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


  public Endpoint type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.id, endpoint.id) &&
        Objects.equals(this.creationDate, endpoint.creationDate) &&
        Objects.equals(this.modificationDate, endpoint.modificationDate) &&
        Objects.equals(this.additional, endpoint.additional) &&
        Objects.equals(this.deleted, endpoint.deleted) &&
        Objects.equals(this.bootstrapId, endpoint.bootstrapId) &&
        Objects.equals(this.location, endpoint.location) &&
        Objects.equals(this.docs, endpoint.docs) &&
        Objects.equals(this.info, endpoint.info) &&
        Objects.equals(this.type, endpoint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, modificationDate, additional, deleted, bootstrapId, location, docs, info, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    bootstrapId: ").append(toIndentedString(bootstrapId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("creationDate");
    openapiFields.add("modificationDate");
    openapiFields.add("additional");
    openapiFields.add("deleted");
    openapiFields.add("bootstrapId");
    openapiFields.add("location");
    openapiFields.add("docs");
    openapiFields.add("info");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Endpoint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Endpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Endpoint is not found in the empty JSON string", Endpoint.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Endpoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Endpoint` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("bootstrapId") != null && !jsonObj.get("bootstrapId").isJsonNull()) && !jsonObj.get("bootstrapId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bootstrapId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bootstrapId").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("docs") != null && !jsonObj.get("docs").isJsonNull()) && !jsonObj.get("docs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docs").toString()));
      }
      if ((jsonObj.get("info") != null && !jsonObj.get("info").isJsonNull()) && !jsonObj.get("info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("info").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Endpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Endpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Endpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Endpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<Endpoint>() {
           @Override
           public void write(JsonWriter out, Endpoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Endpoint read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Endpoint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Endpoint
  * @throws IOException if the JSON string is invalid with respect to Endpoint
  */
  public static Endpoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Endpoint.class);
  }

 /**
  * Convert an instance of Endpoint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

