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
import java.util.List;

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
 * RequestedResourceDesc
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T13:56:16.367272784+03:00[Europe/Sofia]")
public class RequestedResourceDesc {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private URI publisher;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private URI license;

  public static final String SERIALIZED_NAME_SOVEREIGN = "sovereign";
  @SerializedName(SERIALIZED_NAME_SOVEREIGN)
  private URI sovereign;

  public static final String SERIALIZED_NAME_ENDPOINT_DOCUMENTATION = "endpointDocumentation";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_DOCUMENTATION)
  private URI endpointDocumentation;

  public static final String SERIALIZED_NAME_SAMPLES = "samples";
  @SerializedName(SERIALIZED_NAME_SAMPLES)
  private List<URI> samples;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remoteId";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private URI remoteId;

  /**
   * Gets or Sets paymentMethod
   */
  @JsonAdapter(PaymentMethodEnum.Adapter.class)
  public enum PaymentMethodEnum {
    UNDEFINED("undefined"),
    
    FIXEDPRICE("fixedPrice"),
    
    FREE("free"),
    
    NEGOTIATIONBASIS("negotiationBasis");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethodEnum paymentMethod;

  public RequestedResourceDesc() {
  }

  
  public RequestedResourceDesc(
     URI remoteId
  ) {
    this();
    this.remoteId = remoteId;
  }

  public RequestedResourceDesc title(String title) {
    
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


  public RequestedResourceDesc description(String description) {
    
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


  public RequestedResourceDesc keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public RequestedResourceDesc addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public RequestedResourceDesc publisher(URI publisher) {
    
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @javax.annotation.Nullable
  public URI getPublisher() {
    return publisher;
  }


  public void setPublisher(URI publisher) {
    this.publisher = publisher;
  }


  public RequestedResourceDesc language(String language) {
    
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


  public RequestedResourceDesc license(URI license) {
    
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @javax.annotation.Nullable
  public URI getLicense() {
    return license;
  }


  public void setLicense(URI license) {
    this.license = license;
  }


  public RequestedResourceDesc sovereign(URI sovereign) {
    
    this.sovereign = sovereign;
    return this;
  }

   /**
   * Get sovereign
   * @return sovereign
  **/
  @javax.annotation.Nullable
  public URI getSovereign() {
    return sovereign;
  }


  public void setSovereign(URI sovereign) {
    this.sovereign = sovereign;
  }


  public RequestedResourceDesc endpointDocumentation(URI endpointDocumentation) {
    
    this.endpointDocumentation = endpointDocumentation;
    return this;
  }

   /**
   * Get endpointDocumentation
   * @return endpointDocumentation
  **/
  @javax.annotation.Nullable
  public URI getEndpointDocumentation() {
    return endpointDocumentation;
  }


  public void setEndpointDocumentation(URI endpointDocumentation) {
    this.endpointDocumentation = endpointDocumentation;
  }


  public RequestedResourceDesc samples(List<URI> samples) {
    
    this.samples = samples;
    return this;
  }

  public RequestedResourceDesc addSamplesItem(URI samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @javax.annotation.Nullable
  public List<URI> getSamples() {
    return samples;
  }


  public void setSamples(List<URI> samples) {
    this.samples = samples;
  }


   /**
   * Get remoteId
   * @return remoteId
  **/
  @javax.annotation.Nullable
  public URI getRemoteId() {
    return remoteId;
  }




  public RequestedResourceDesc paymentMethod(PaymentMethodEnum paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedResourceDesc requestedResourceDesc = (RequestedResourceDesc) o;
    return Objects.equals(this.title, requestedResourceDesc.title) &&
        Objects.equals(this.description, requestedResourceDesc.description) &&
        Objects.equals(this.keywords, requestedResourceDesc.keywords) &&
        Objects.equals(this.publisher, requestedResourceDesc.publisher) &&
        Objects.equals(this.language, requestedResourceDesc.language) &&
        Objects.equals(this.license, requestedResourceDesc.license) &&
        Objects.equals(this.sovereign, requestedResourceDesc.sovereign) &&
        Objects.equals(this.endpointDocumentation, requestedResourceDesc.endpointDocumentation) &&
        Objects.equals(this.samples, requestedResourceDesc.samples) &&
        Objects.equals(this.remoteId, requestedResourceDesc.remoteId) &&
        Objects.equals(this.paymentMethod, requestedResourceDesc.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, keywords, publisher, language, license, sovereign, endpointDocumentation, samples, remoteId, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedResourceDesc {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    sovereign: ").append(toIndentedString(sovereign)).append("\n");
    sb.append("    endpointDocumentation: ").append(toIndentedString(endpointDocumentation)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
    openapiFields.add("keywords");
    openapiFields.add("publisher");
    openapiFields.add("language");
    openapiFields.add("license");
    openapiFields.add("sovereign");
    openapiFields.add("endpointDocumentation");
    openapiFields.add("samples");
    openapiFields.add("remoteId");
    openapiFields.add("paymentMethod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestedResourceDesc
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RequestedResourceDesc.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestedResourceDesc is not found in the empty JSON string", RequestedResourceDesc.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RequestedResourceDesc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestedResourceDesc` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      if ((jsonObj.get("publisher") != null && !jsonObj.get("publisher").isJsonNull()) && !jsonObj.get("publisher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publisher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publisher").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull()) && !jsonObj.get("license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license").toString()));
      }
      if ((jsonObj.get("sovereign") != null && !jsonObj.get("sovereign").isJsonNull()) && !jsonObj.get("sovereign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sovereign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sovereign").toString()));
      }
      if ((jsonObj.get("endpointDocumentation") != null && !jsonObj.get("endpointDocumentation").isJsonNull()) && !jsonObj.get("endpointDocumentation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointDocumentation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointDocumentation").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("samples") != null && !jsonObj.get("samples").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `samples` to be an array in the JSON string but got `%s`", jsonObj.get("samples").toString()));
      }
      if ((jsonObj.get("remoteId") != null && !jsonObj.get("remoteId").isJsonNull()) && !jsonObj.get("remoteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteId").toString()));
      }
      if ((jsonObj.get("paymentMethod") != null && !jsonObj.get("paymentMethod").isJsonNull()) && !jsonObj.get("paymentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestedResourceDesc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestedResourceDesc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestedResourceDesc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestedResourceDesc.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestedResourceDesc>() {
           @Override
           public void write(JsonWriter out, RequestedResourceDesc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestedResourceDesc read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestedResourceDesc given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestedResourceDesc
  * @throws IOException if the JSON string is invalid with respect to RequestedResourceDesc
  */
  public static RequestedResourceDesc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestedResourceDesc.class);
  }

 /**
  * Convert an instance of RequestedResourceDesc to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

