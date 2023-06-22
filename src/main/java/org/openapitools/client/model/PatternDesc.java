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
 * PatternDesc
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T13:41:35.633205213+03:00[Europe/Sofia]")
public class PatternDesc {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public PatternDesc() {
    this.type = this.getClass().getSimpleName();
  }

  public PatternDesc title(String title) {
    
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


  public PatternDesc description(String description) {
    
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


  public PatternDesc type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
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
    PatternDesc patternDesc = (PatternDesc) o;
    return Objects.equals(this.title, patternDesc.title) &&
        Objects.equals(this.description, patternDesc.description) &&
        Objects.equals(this.type, patternDesc.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatternDesc {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatternDesc
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PatternDesc.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatternDesc is not found in the empty JSON string", PatternDesc.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "ConnectorRestrictionDesc":
          ConnectorRestrictionDesc.validateJsonObject(jsonObj);
          break;
        case "DeletionDesc":
          DeletionDesc.validateJsonObject(jsonObj);
          break;
        case "DurationDesc":
          DurationDesc.validateJsonObject(jsonObj);
          break;
        case "IntervalDesc":
          IntervalDesc.validateJsonObject(jsonObj);
          break;
        case "LoggingDesc":
          LoggingDesc.validateJsonObject(jsonObj);
          break;
        case "NotificationDesc":
          NotificationDesc.validateJsonObject(jsonObj);
          break;
        case "PermissionDesc":
          PermissionDesc.validateJsonObject(jsonObj);
          break;
        case "ProhibitionDesc":
          ProhibitionDesc.validateJsonObject(jsonObj);
          break;
        case "SecurityRestrictionDesc":
          SecurityRestrictionDesc.validateJsonObject(jsonObj);
          break;
        case "UsageNumberDesc":
          UsageNumberDesc.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of PatternDesc given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatternDesc
  * @throws IOException if the JSON string is invalid with respect to PatternDesc
  */
  public static PatternDesc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatternDesc.class);
  }

 /**
  * Convert an instance of PatternDesc to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
