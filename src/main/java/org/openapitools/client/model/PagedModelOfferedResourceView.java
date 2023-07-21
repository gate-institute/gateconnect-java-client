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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Link;
import org.openapitools.client.model.PageMetadata;
import org.openapitools.client.model.PagedModelOfferedResourceViewEmbedded;

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
 * PagedModelOfferedResourceView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:13:44.561612454+03:00[Europe/Sofia]")
public class PagedModelOfferedResourceView {
  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private PagedModelOfferedResourceViewEmbedded embedded;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = new HashMap<>();

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private PageMetadata page;

  public PagedModelOfferedResourceView() {
  }

  public PagedModelOfferedResourceView embedded(PagedModelOfferedResourceViewEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  public PagedModelOfferedResourceViewEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(PagedModelOfferedResourceViewEmbedded embedded) {
    this.embedded = embedded;
  }


  public PagedModelOfferedResourceView links(Map<String, Link> links) {
    
    this.links = links;
    return this;
  }

  public PagedModelOfferedResourceView putLinksItem(String key, Link linksItem) {
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


  public PagedModelOfferedResourceView page(PageMetadata page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  public PageMetadata getPage() {
    return page;
  }


  public void setPage(PageMetadata page) {
    this.page = page;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelOfferedResourceView pagedModelOfferedResourceView = (PagedModelOfferedResourceView) o;
    return Objects.equals(this.embedded, pagedModelOfferedResourceView.embedded) &&
        Objects.equals(this.links, pagedModelOfferedResourceView.links) &&
        Objects.equals(this.page, pagedModelOfferedResourceView.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelOfferedResourceView {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
    openapiFields.add("_embedded");
    openapiFields.add("_links");
    openapiFields.add("page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagedModelOfferedResourceView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagedModelOfferedResourceView.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedModelOfferedResourceView is not found in the empty JSON string", PagedModelOfferedResourceView.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PagedModelOfferedResourceView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagedModelOfferedResourceView` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `_embedded`
      if (jsonObj.get("_embedded") != null && !jsonObj.get("_embedded").isJsonNull()) {
        PagedModelOfferedResourceViewEmbedded.validateJsonObject(jsonObj.getAsJsonObject("_embedded"));
      }
      // validate the optional field `page`
      if (jsonObj.get("page") != null && !jsonObj.get("page").isJsonNull()) {
        PageMetadata.validateJsonObject(jsonObj.getAsJsonObject("page"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagedModelOfferedResourceView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedModelOfferedResourceView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedModelOfferedResourceView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedModelOfferedResourceView.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedModelOfferedResourceView>() {
           @Override
           public void write(JsonWriter out, PagedModelOfferedResourceView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagedModelOfferedResourceView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagedModelOfferedResourceView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagedModelOfferedResourceView
  * @throws IOException if the JSON string is invalid with respect to PagedModelOfferedResourceView
  */
  public static PagedModelOfferedResourceView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedModelOfferedResourceView.class);
  }

 /**
  * Convert an instance of PagedModelOfferedResourceView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

