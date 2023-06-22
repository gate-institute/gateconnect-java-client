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
import org.openapitools.client.model.BrokerView;

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
 * PagedModelBrokerViewEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T13:41:35.633205213+03:00[Europe/Sofia]")
public class PagedModelBrokerViewEmbedded {
  public static final String SERIALIZED_NAME_BROKERS = "brokers";
  @SerializedName(SERIALIZED_NAME_BROKERS)
  private List<BrokerView> brokers;

  public PagedModelBrokerViewEmbedded() {
  }

  public PagedModelBrokerViewEmbedded brokers(List<BrokerView> brokers) {
    
    this.brokers = brokers;
    return this;
  }

  public PagedModelBrokerViewEmbedded addBrokersItem(BrokerView brokersItem) {
    if (this.brokers == null) {
      this.brokers = new ArrayList<>();
    }
    this.brokers.add(brokersItem);
    return this;
  }

   /**
   * Get brokers
   * @return brokers
  **/
  @javax.annotation.Nullable
  public List<BrokerView> getBrokers() {
    return brokers;
  }


  public void setBrokers(List<BrokerView> brokers) {
    this.brokers = brokers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelBrokerViewEmbedded pagedModelBrokerViewEmbedded = (PagedModelBrokerViewEmbedded) o;
    return Objects.equals(this.brokers, pagedModelBrokerViewEmbedded.brokers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelBrokerViewEmbedded {\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
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
    openapiFields.add("brokers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagedModelBrokerViewEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagedModelBrokerViewEmbedded.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedModelBrokerViewEmbedded is not found in the empty JSON string", PagedModelBrokerViewEmbedded.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PagedModelBrokerViewEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagedModelBrokerViewEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brokers") != null && !jsonObj.get("brokers").isJsonNull()) {
        JsonArray jsonArraybrokers = jsonObj.getAsJsonArray("brokers");
        if (jsonArraybrokers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("brokers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `brokers` to be an array in the JSON string but got `%s`", jsonObj.get("brokers").toString()));
          }

          // validate the optional field `brokers` (array)
          for (int i = 0; i < jsonArraybrokers.size(); i++) {
            BrokerView.validateJsonObject(jsonArraybrokers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagedModelBrokerViewEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedModelBrokerViewEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedModelBrokerViewEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedModelBrokerViewEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedModelBrokerViewEmbedded>() {
           @Override
           public void write(JsonWriter out, PagedModelBrokerViewEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagedModelBrokerViewEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagedModelBrokerViewEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagedModelBrokerViewEmbedded
  * @throws IOException if the JSON string is invalid with respect to PagedModelBrokerViewEmbedded
  */
  public static PagedModelBrokerViewEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedModelBrokerViewEmbedded.class);
  }

 /**
  * Convert an instance of PagedModelBrokerViewEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
