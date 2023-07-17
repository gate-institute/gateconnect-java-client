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
import org.openapitools.client.model.RdfResource;

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
 * ConstraintAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T13:56:16.367272784+03:00[Europe/Sofia]")
public class ConstraintAllOf {
  public static final String SERIALIZED_NAME_IDS_COLON_RIGHT_OPERAND_REFERENCE = "ids:rightOperandReference";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_RIGHT_OPERAND_REFERENCE)
  private URI idsColonRightOperandReference;

  public static final String SERIALIZED_NAME_IDS_COLON_UNIT = "ids:unit";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_UNIT)
  private URI idsColonUnit;

  /**
   * Gets or Sets idsColonOperator
   */
  @JsonAdapter(IdsColonOperatorEnum.Adapter.class)
  public enum IdsColonOperatorEnum {
    AFTER("https://w3id.org/idsa/code/AFTER"),
    
    BEFORE("https://w3id.org/idsa/code/BEFORE"),
    
    CONTAINS("https://w3id.org/idsa/code/CONTAINS"),
    
    COVERED_BY("https://w3id.org/idsa/code/COVERED_BY"),
    
    COVERS("https://w3id.org/idsa/code/COVERS"),
    
    DEFINES_AS("https://w3id.org/idsa/code/DEFINES_AS"),
    
    DISJOINT("https://w3id.org/idsa/code/DISJOINT"),
    
    DURATION_EQ("https://w3id.org/idsa/code/DURATION_EQ"),
    
    DURING("https://w3id.org/idsa/code/DURING"),
    
    EQ("https://w3id.org/idsa/code/EQ"),
    
    EQUALS("https://w3id.org/idsa/code/EQUALS"),
    
    FINISHED_BY("https://w3id.org/idsa/code/FINISHED_BY"),
    
    FINISHES("https://w3id.org/idsa/code/FINISHES"),
    
    GT("https://w3id.org/idsa/code/GT"),
    
    GTEQ("https://w3id.org/idsa/code/GTEQ"),
    
    HAS_MEMBERSHIP("https://w3id.org/idsa/code/HAS_MEMBERSHIP"),
    
    HAS_SITE("https://w3id.org/idsa/code/HAS_SITE"),
    
    HAS_STATE("https://w3id.org/idsa/code/HAS_STATE"),
    
    IN("https://w3id.org/idsa/code/IN"),
    
    INSIDE("https://w3id.org/idsa/code/INSIDE"),
    
    INSIDE_NETWORK("https://w3id.org/idsa/code/INSIDE_NETWORK"),
    
    LONGER("https://w3id.org/idsa/code/LONGER"),
    
    LONGER_EQ("https://w3id.org/idsa/code/LONGER_EQ"),
    
    LT("https://w3id.org/idsa/code/LT"),
    
    LTEQ("https://w3id.org/idsa/code/LTEQ"),
    
    MATCHES("https://w3id.org/idsa/code/MATCHES"),
    
    MEETS("https://w3id.org/idsa/code/MEETS"),
    
    MEMBER_OF("https://w3id.org/idsa/code/MEMBER_OF"),
    
    MET_BY("https://w3id.org/idsa/code/MET_BY"),
    
    NOT("https://w3id.org/idsa/code/NOT"),
    
    OVERLAPPED_BY("https://w3id.org/idsa/code/OVERLAPPED_BY"),
    
    OVERLAPS("https://w3id.org/idsa/code/OVERLAPS"),
    
    SAME_AS("https://w3id.org/idsa/code/SAME_AS"),
    
    SHORTER("https://w3id.org/idsa/code/SHORTER"),
    
    SHORTER_EQ("https://w3id.org/idsa/code/SHORTER_EQ"),
    
    SPATIAL_CONTAINS("https://w3id.org/idsa/code/SPATIAL_CONTAINS"),
    
    SPATIAL_EQUALS("https://w3id.org/idsa/code/SPATIAL_EQUALS"),
    
    SPATIAL_MEET("https://w3id.org/idsa/code/SPATIAL_MEET"),
    
    SPATIAL_OVERLAP("https://w3id.org/idsa/code/SPATIAL_OVERLAP"),
    
    STARTED_BY("https://w3id.org/idsa/code/STARTED_BY"),
    
    STARTS("https://w3id.org/idsa/code/STARTS"),
    
    STRING_CONTAINS("https://w3id.org/idsa/code/STRING_CONTAINS"),
    
    STRING_EQ("https://w3id.org/idsa/code/STRING_EQ"),
    
    STRING_IS_CONTAINED("https://w3id.org/idsa/code/STRING_IS_CONTAINED"),
    
    TEMPORAL_DISJOINT("https://w3id.org/idsa/code/TEMPORAL_DISJOINT"),
    
    TEMPORAL_EQUALS("https://w3id.org/idsa/code/TEMPORAL_EQUALS");

    private String value;

    IdsColonOperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdsColonOperatorEnum fromValue(String value) {
      for (IdsColonOperatorEnum b : IdsColonOperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdsColonOperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdsColonOperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdsColonOperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdsColonOperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IDS_COLON_OPERATOR = "ids:operator";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_OPERATOR)
  private IdsColonOperatorEnum idsColonOperator;

  /**
   * Gets or Sets idsColonLeftOperand
   */
  @JsonAdapter(IdsColonLeftOperandEnum.Adapter.class)
  public enum IdsColonLeftOperandEnum {
    ABSOLUTE_SPATIAL_POSITION("https://w3id.org/idsa/code/ABSOLUTE_SPATIAL_POSITION"),
    
    COUNT("https://w3id.org/idsa/code/COUNT"),
    
    DELAY("https://w3id.org/idsa/code/DELAY"),
    
    ELAPSED_TIME("https://w3id.org/idsa/code/ELAPSED_TIME"),
    
    ENDPOINT("https://w3id.org/idsa/code/ENDPOINT"),
    
    EVENT("https://w3id.org/idsa/code/EVENT"),
    
    PATH("https://w3id.org/idsa/code/PATH"),
    
    PAYMENT("https://w3id.org/idsa/code/PAYMENT"),
    
    PAY_AMOUNT("https://w3id.org/idsa/code/PAY_AMOUNT"),
    
    POLICY_EVALUATION_TIME("https://w3id.org/idsa/code/POLICY_EVALUATION_TIME"),
    
    PURPOSE("https://w3id.org/idsa/code/PURPOSE"),
    
    QUANTITY("https://w3id.org/idsa/code/QUANTITY"),
    
    RECURRENCE_RATE("https://w3id.org/idsa/code/RECURRENCE_RATE"),
    
    SECURITY_LEVEL("https://w3id.org/idsa/code/SECURITY_LEVEL"),
    
    STATE("https://w3id.org/idsa/code/STATE"),
    
    SYSTEM("https://w3id.org/idsa/code/SYSTEM"),
    
    USER("https://w3id.org/idsa/code/USER");

    private String value;

    IdsColonLeftOperandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdsColonLeftOperandEnum fromValue(String value) {
      for (IdsColonLeftOperandEnum b : IdsColonLeftOperandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdsColonLeftOperandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdsColonLeftOperandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdsColonLeftOperandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdsColonLeftOperandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IDS_COLON_LEFT_OPERAND = "ids:leftOperand";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_LEFT_OPERAND)
  private IdsColonLeftOperandEnum idsColonLeftOperand;

  public static final String SERIALIZED_NAME_IDS_COLON_RIGHT_OPERAND = "ids:rightOperand";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_RIGHT_OPERAND)
  private RdfResource idsColonRightOperand;

  public static final String SERIALIZED_NAME_IDS_COLON_PIP_ENDPOINT = "ids:pipEndpoint";
  @SerializedName(SERIALIZED_NAME_IDS_COLON_PIP_ENDPOINT)
  private URI idsColonPipEndpoint;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;

  public ConstraintAllOf() {
  }

  public ConstraintAllOf idsColonRightOperandReference(URI idsColonRightOperandReference) {
    
    this.idsColonRightOperandReference = idsColonRightOperandReference;
    return this;
  }

   /**
   * Get idsColonRightOperandReference
   * @return idsColonRightOperandReference
  **/
  @javax.annotation.Nullable
  public URI getIdsColonRightOperandReference() {
    return idsColonRightOperandReference;
  }


  public void setIdsColonRightOperandReference(URI idsColonRightOperandReference) {
    this.idsColonRightOperandReference = idsColonRightOperandReference;
  }


  public ConstraintAllOf idsColonUnit(URI idsColonUnit) {
    
    this.idsColonUnit = idsColonUnit;
    return this;
  }

   /**
   * Get idsColonUnit
   * @return idsColonUnit
  **/
  @javax.annotation.Nullable
  public URI getIdsColonUnit() {
    return idsColonUnit;
  }


  public void setIdsColonUnit(URI idsColonUnit) {
    this.idsColonUnit = idsColonUnit;
  }


  public ConstraintAllOf idsColonOperator(IdsColonOperatorEnum idsColonOperator) {
    
    this.idsColonOperator = idsColonOperator;
    return this;
  }

   /**
   * Get idsColonOperator
   * @return idsColonOperator
  **/
  @javax.annotation.Nullable
  public IdsColonOperatorEnum getIdsColonOperator() {
    return idsColonOperator;
  }


  public void setIdsColonOperator(IdsColonOperatorEnum idsColonOperator) {
    this.idsColonOperator = idsColonOperator;
  }


  public ConstraintAllOf idsColonLeftOperand(IdsColonLeftOperandEnum idsColonLeftOperand) {
    
    this.idsColonLeftOperand = idsColonLeftOperand;
    return this;
  }

   /**
   * Get idsColonLeftOperand
   * @return idsColonLeftOperand
  **/
  @javax.annotation.Nullable
  public IdsColonLeftOperandEnum getIdsColonLeftOperand() {
    return idsColonLeftOperand;
  }


  public void setIdsColonLeftOperand(IdsColonLeftOperandEnum idsColonLeftOperand) {
    this.idsColonLeftOperand = idsColonLeftOperand;
  }


  public ConstraintAllOf idsColonRightOperand(RdfResource idsColonRightOperand) {
    
    this.idsColonRightOperand = idsColonRightOperand;
    return this;
  }

   /**
   * Get idsColonRightOperand
   * @return idsColonRightOperand
  **/
  @javax.annotation.Nullable
  public RdfResource getIdsColonRightOperand() {
    return idsColonRightOperand;
  }


  public void setIdsColonRightOperand(RdfResource idsColonRightOperand) {
    this.idsColonRightOperand = idsColonRightOperand;
  }


  public ConstraintAllOf idsColonPipEndpoint(URI idsColonPipEndpoint) {
    
    this.idsColonPipEndpoint = idsColonPipEndpoint;
    return this;
  }

   /**
   * Get idsColonPipEndpoint
   * @return idsColonPipEndpoint
  **/
  @javax.annotation.Nullable
  public URI getIdsColonPipEndpoint() {
    return idsColonPipEndpoint;
  }


  public void setIdsColonPipEndpoint(URI idsColonPipEndpoint) {
    this.idsColonPipEndpoint = idsColonPipEndpoint;
  }


  public ConstraintAllOf atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nullable
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
    ConstraintAllOf constraintAllOf = (ConstraintAllOf) o;
    return Objects.equals(this.idsColonRightOperandReference, constraintAllOf.idsColonRightOperandReference) &&
        Objects.equals(this.idsColonUnit, constraintAllOf.idsColonUnit) &&
        Objects.equals(this.idsColonOperator, constraintAllOf.idsColonOperator) &&
        Objects.equals(this.idsColonLeftOperand, constraintAllOf.idsColonLeftOperand) &&
        Objects.equals(this.idsColonRightOperand, constraintAllOf.idsColonRightOperand) &&
        Objects.equals(this.idsColonPipEndpoint, constraintAllOf.idsColonPipEndpoint) &&
        Objects.equals(this.atType, constraintAllOf.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idsColonRightOperandReference, idsColonUnit, idsColonOperator, idsColonLeftOperand, idsColonRightOperand, idsColonPipEndpoint, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstraintAllOf {\n");
    sb.append("    idsColonRightOperandReference: ").append(toIndentedString(idsColonRightOperandReference)).append("\n");
    sb.append("    idsColonUnit: ").append(toIndentedString(idsColonUnit)).append("\n");
    sb.append("    idsColonOperator: ").append(toIndentedString(idsColonOperator)).append("\n");
    sb.append("    idsColonLeftOperand: ").append(toIndentedString(idsColonLeftOperand)).append("\n");
    sb.append("    idsColonRightOperand: ").append(toIndentedString(idsColonRightOperand)).append("\n");
    sb.append("    idsColonPipEndpoint: ").append(toIndentedString(idsColonPipEndpoint)).append("\n");
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
    openapiFields.add("ids:rightOperandReference");
    openapiFields.add("ids:unit");
    openapiFields.add("ids:operator");
    openapiFields.add("ids:leftOperand");
    openapiFields.add("ids:rightOperand");
    openapiFields.add("ids:pipEndpoint");
    openapiFields.add("@type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConstraintAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConstraintAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConstraintAllOf is not found in the empty JSON string", ConstraintAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConstraintAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConstraintAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ids:rightOperandReference") != null && !jsonObj.get("ids:rightOperandReference").isJsonNull()) && !jsonObj.get("ids:rightOperandReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids:rightOperandReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ids:rightOperandReference").toString()));
      }
      if ((jsonObj.get("ids:unit") != null && !jsonObj.get("ids:unit").isJsonNull()) && !jsonObj.get("ids:unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids:unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ids:unit").toString()));
      }
      if ((jsonObj.get("ids:operator") != null && !jsonObj.get("ids:operator").isJsonNull()) && !jsonObj.get("ids:operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids:operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ids:operator").toString()));
      }
      if ((jsonObj.get("ids:leftOperand") != null && !jsonObj.get("ids:leftOperand").isJsonNull()) && !jsonObj.get("ids:leftOperand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids:leftOperand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ids:leftOperand").toString()));
      }
      // validate the optional field `ids:rightOperand`
      if (jsonObj.get("ids:rightOperand") != null && !jsonObj.get("ids:rightOperand").isJsonNull()) {
        RdfResource.validateJsonObject(jsonObj.getAsJsonObject("ids:rightOperand"));
      }
      if ((jsonObj.get("ids:pipEndpoint") != null && !jsonObj.get("ids:pipEndpoint").isJsonNull()) && !jsonObj.get("ids:pipEndpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids:pipEndpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ids:pipEndpoint").toString()));
      }
      if ((jsonObj.get("@type") != null && !jsonObj.get("@type").isJsonNull()) && !jsonObj.get("@type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `@type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("@type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConstraintAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConstraintAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConstraintAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConstraintAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ConstraintAllOf>() {
           @Override
           public void write(JsonWriter out, ConstraintAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConstraintAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConstraintAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConstraintAllOf
  * @throws IOException if the JSON string is invalid with respect to ConstraintAllOf
  */
  public static ConstraintAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConstraintAllOf.class);
  }

 /**
  * Convert an instance of ConstraintAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

