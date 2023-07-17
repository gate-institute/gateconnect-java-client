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
 * The subscription object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T13:56:16.367272784+03:00[Europe/Sofia]")
public class SubscriptionDesc {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private URI target;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private URI location;

  public static final String SERIALIZED_NAME_SUBSCRIBER = "subscriber";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER)
  private URI subscriber;

  public static final String SERIALIZED_NAME_PUSH_DATA = "pushData";
  @SerializedName(SERIALIZED_NAME_PUSH_DATA)
  private Boolean pushData;

  public static final String SERIALIZED_NAME_IDS_PROTOCOL = "idsProtocol";
  @SerializedName(SERIALIZED_NAME_IDS_PROTOCOL)
  private Boolean idsProtocol;

  public SubscriptionDesc() {
  }

  
  public SubscriptionDesc(
     Boolean idsProtocol
  ) {
    this();
    this.idsProtocol = idsProtocol;
  }

  public SubscriptionDesc title(String title) {
    
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


  public SubscriptionDesc description(String description) {
    
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


  public SubscriptionDesc target(URI target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  public URI getTarget() {
    return target;
  }


  public void setTarget(URI target) {
    this.target = target;
  }


  public SubscriptionDesc location(URI location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public URI getLocation() {
    return location;
  }


  public void setLocation(URI location) {
    this.location = location;
  }


  public SubscriptionDesc subscriber(URI subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @javax.annotation.Nullable
  public URI getSubscriber() {
    return subscriber;
  }


  public void setSubscriber(URI subscriber) {
    this.subscriber = subscriber;
  }


  public SubscriptionDesc pushData(Boolean pushData) {
    
    this.pushData = pushData;
    return this;
  }

   /**
   * Get pushData
   * @return pushData
  **/
  @javax.annotation.Nullable
  public Boolean getPushData() {
    return pushData;
  }


  public void setPushData(Boolean pushData) {
    this.pushData = pushData;
  }


   /**
   * Get idsProtocol
   * @return idsProtocol
  **/
  @javax.annotation.Nullable
  public Boolean getIdsProtocol() {
    return idsProtocol;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDesc subscriptionDesc = (SubscriptionDesc) o;
    return Objects.equals(this.title, subscriptionDesc.title) &&
        Objects.equals(this.description, subscriptionDesc.description) &&
        Objects.equals(this.target, subscriptionDesc.target) &&
        Objects.equals(this.location, subscriptionDesc.location) &&
        Objects.equals(this.subscriber, subscriptionDesc.subscriber) &&
        Objects.equals(this.pushData, subscriptionDesc.pushData) &&
        Objects.equals(this.idsProtocol, subscriptionDesc.idsProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, target, location, subscriber, pushData, idsProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDesc {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    pushData: ").append(toIndentedString(pushData)).append("\n");
    sb.append("    idsProtocol: ").append(toIndentedString(idsProtocol)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("target");
    openapiFields.add("location");
    openapiFields.add("subscriber");
    openapiFields.add("pushData");
    openapiFields.add("idsProtocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriptionDesc
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubscriptionDesc.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionDesc is not found in the empty JSON string", SubscriptionDesc.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionDesc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionDesc` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("subscriber") != null && !jsonObj.get("subscriber").isJsonNull()) && !jsonObj.get("subscriber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionDesc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionDesc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionDesc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionDesc.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionDesc>() {
           @Override
           public void write(JsonWriter out, SubscriptionDesc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionDesc read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionDesc given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionDesc
  * @throws IOException if the JSON string is invalid with respect to SubscriptionDesc
  */
  public static SubscriptionDesc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionDesc.class);
  }

 /**
  * Convert an instance of SubscriptionDesc to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

