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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.TypedLiteral;

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
 * AbstractConstraint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T16:01:45.808576329+03:00[Europe/Sofia]")
public class AbstractConstraint {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private List<TypedLiteral> comment;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private List<TypedLiteral> label;

  public static final String SERIALIZED_NAME_AT_ID = "@id";
  @SerializedName(SERIALIZED_NAME_AT_ID)
  private URI atId;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  protected String atType;

  public AbstractConstraint() {
    this.atType = this.getClass().getSimpleName();
  }

  public AbstractConstraint properties(Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public AbstractConstraint putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }


  public AbstractConstraint comment(List<TypedLiteral> comment) {
    
    this.comment = comment;
    return this;
  }

  public AbstractConstraint addCommentItem(TypedLiteral commentItem) {
    if (this.comment == null) {
      this.comment = new ArrayList<>();
    }
    this.comment.add(commentItem);
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public List<TypedLiteral> getComment() {
    return comment;
  }


  public void setComment(List<TypedLiteral> comment) {
    this.comment = comment;
  }


  public AbstractConstraint label(List<TypedLiteral> label) {
    
    this.label = label;
    return this;
  }

  public AbstractConstraint addLabelItem(TypedLiteral labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<>();
    }
    this.label.add(labelItem);
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public List<TypedLiteral> getLabel() {
    return label;
  }


  public void setLabel(List<TypedLiteral> label) {
    this.label = label;
  }


  public AbstractConstraint atId(URI atId) {
    
    this.atId = atId;
    return this;
  }

   /**
   * Get atId
   * @return atId
  **/
  @javax.annotation.Nonnull
  public URI getAtId() {
    return atId;
  }


  public void setAtId(URI atId) {
    this.atId = atId;
  }


  public AbstractConstraint atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nonnull
  public String getAtType() {
    return atType;
  }


  public void setAtType(String atType) {
    this.atType = atType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractConstraint abstractConstraint = (AbstractConstraint) o;
    return Objects.equals(this.properties, abstractConstraint.properties) &&
        Objects.equals(this.comment, abstractConstraint.comment) &&
        Objects.equals(this.label, abstractConstraint.label) &&
        Objects.equals(this.atId, abstractConstraint.atId) &&
        Objects.equals(this.atType, abstractConstraint.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, comment, label, atId, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractConstraint {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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
    openapiFields.add("properties");
    openapiFields.add("comment");
    openapiFields.add("label");
    openapiFields.add("@id");
    openapiFields.add("@type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("@id");
    openapiRequiredFields.add("@type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbstractConstraint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbstractConstraint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbstractConstraint is not found in the empty JSON string", AbstractConstraint.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("@type").getAsString();
      switch (discriminatorValue) {
        case "Constraint":
          Constraint.validateJsonObject(jsonObj);
          break;
        case "LogicalConstraint":
          LogicalConstraint.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `@type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of AbstractConstraint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbstractConstraint
  * @throws IOException if the JSON string is invalid with respect to AbstractConstraint
  */
  public static AbstractConstraint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbstractConstraint.class);
  }

 /**
  * Convert an instance of AbstractConstraint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

