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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * AppView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-22T13:41:35.633205213+03:00[Europe/Sofia]")
public class AppView {
  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modificationDate";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remoteId";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private URI remoteId;

  public static final String SERIALIZED_NAME_REMOTE_ADDRESS = "remoteAddress";
  @SerializedName(SERIALIZED_NAME_REMOTE_ADDRESS)
  private URI remoteAddress;

  public static final String SERIALIZED_NAME_DOCS = "docs";
  @SerializedName(SERIALIZED_NAME_DOCS)
  private String docs;

  public static final String SERIALIZED_NAME_ENV_VARIABLES = "envVariables";
  @SerializedName(SERIALIZED_NAME_ENV_VARIABLES)
  private String envVariables;

  public static final String SERIALIZED_NAME_STORAGE_CONFIG = "storageConfig";
  @SerializedName(SERIALIZED_NAME_STORAGE_CONFIG)
  private String storageConfig;

  /**
   * Gets or Sets supportedPolicies
   */
  @JsonAdapter(SupportedPoliciesEnum.Adapter.class)
  public enum SupportedPoliciesEnum {
    PROVIDE_UNRESTRICTED_DATA_ACCESS("Provide unrestricted data access"),
    
    PROHIBIT_THE_DATA_ACCESS("Prohibit the data access"),
    
    RESTRICT_THE_DATA_USAGE_TO_NOT_MORE_THAN_N_TIMES("Restrict the data usage to not more than N times"),
    
    RESTRICT_THE_DATA_USAGE_TO_A_SPECIFIC_TIME_DURATION("Restrict the data usage to a specific time duration"),
    
    RESTRICT_THE_DATA_USAGE_TO_A_SPECIFIC_TIME_INTERVAL("Restrict the data usage to a specific time interval"),
    
    USE_DATA_AND_DELETE_IT_AT_A_SPECIFIC_DATE_TIME("Use data and delete it at a specific date time"),
    
    LOG_THE_DATA_USAGE_INFORMATION("Log the data usage information"),
    
    NOTIFY_A_PARTY_OR_A_SPECIFIC_GROUP_OF_USERS_WHEN_THE_DATA_IS_USED("Notify a party or a specific group of users when the data is used"),
    
    RESTRICT_THE_DATA_USAGE_TO_A_SPECIFIC_CONNECTOR("Restrict the data usage to a specific connector"),
    
    RESTRICT_THE_DATA_USAGE_TO_A_SECURITY_PROFILE("Restrict the data usage to a security profile");

    private String value;

    SupportedPoliciesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SupportedPoliciesEnum fromValue(String value) {
      for (SupportedPoliciesEnum b : SupportedPoliciesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SupportedPoliciesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SupportedPoliciesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SupportedPoliciesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SupportedPoliciesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUPPORTED_POLICIES = "supportedPolicies";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_POLICIES)
  private List<SupportedPoliciesEnum> supportedPolicies;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private URI publisher;

  public static final String SERIALIZED_NAME_SOVEREIGN = "sovereign";
  @SerializedName(SERIALIZED_NAME_SOVEREIGN)
  private URI sovereign;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private URI license;

  public static final String SERIALIZED_NAME_ENDPOINT_DOCUMENTATION = "endpointDocumentation";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_DOCUMENTATION)
  private URI endpointDocumentation;

  public static final String SERIALIZED_NAME_DISTRIBUTION_SERVICE = "distributionService";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_SERVICE)
  private URI distributionService;

  public static final String SERIALIZED_NAME_RUNTIME_ENVIRONMENT = "runtimeEnvironment";
  @SerializedName(SERIALIZED_NAME_RUNTIME_ENVIRONMENT)
  private String runtimeEnvironment;

  public static final String SERIALIZED_NAME_ADDITIONAL = "additional";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL)
  private Map<String, String> additional = new HashMap<>();

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Link> links = new HashMap<>();

  public AppView() {
  }

  public AppView creationDate(OffsetDateTime creationDate) {
    
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


  public AppView modificationDate(OffsetDateTime modificationDate) {
    
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


  public AppView title(String title) {
    
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


  public AppView description(String description) {
    
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


  public AppView remoteId(URI remoteId) {
    
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


  public AppView remoteAddress(URI remoteAddress) {
    
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @javax.annotation.Nullable
  public URI getRemoteAddress() {
    return remoteAddress;
  }


  public void setRemoteAddress(URI remoteAddress) {
    this.remoteAddress = remoteAddress;
  }


  public AppView docs(String docs) {
    
    this.docs = docs;
    return this;
  }

   /**
   * Get docs
   * @return docs
  **/
  @javax.annotation.Nullable
  public String getDocs() {
    return docs;
  }


  public void setDocs(String docs) {
    this.docs = docs;
  }


  public AppView envVariables(String envVariables) {
    
    this.envVariables = envVariables;
    return this;
  }

   /**
   * Get envVariables
   * @return envVariables
  **/
  @javax.annotation.Nullable
  public String getEnvVariables() {
    return envVariables;
  }


  public void setEnvVariables(String envVariables) {
    this.envVariables = envVariables;
  }


  public AppView storageConfig(String storageConfig) {
    
    this.storageConfig = storageConfig;
    return this;
  }

   /**
   * Get storageConfig
   * @return storageConfig
  **/
  @javax.annotation.Nullable
  public String getStorageConfig() {
    return storageConfig;
  }


  public void setStorageConfig(String storageConfig) {
    this.storageConfig = storageConfig;
  }


  public AppView supportedPolicies(List<SupportedPoliciesEnum> supportedPolicies) {
    
    this.supportedPolicies = supportedPolicies;
    return this;
  }

  public AppView addSupportedPoliciesItem(SupportedPoliciesEnum supportedPoliciesItem) {
    if (this.supportedPolicies == null) {
      this.supportedPolicies = new ArrayList<>();
    }
    this.supportedPolicies.add(supportedPoliciesItem);
    return this;
  }

   /**
   * Get supportedPolicies
   * @return supportedPolicies
  **/
  @javax.annotation.Nullable
  public List<SupportedPoliciesEnum> getSupportedPolicies() {
    return supportedPolicies;
  }


  public void setSupportedPolicies(List<SupportedPoliciesEnum> supportedPolicies) {
    this.supportedPolicies = supportedPolicies;
  }


  public AppView keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public AppView addKeywordsItem(String keywordsItem) {
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


  public AppView publisher(URI publisher) {
    
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


  public AppView sovereign(URI sovereign) {
    
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


  public AppView language(String language) {
    
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


  public AppView license(URI license) {
    
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


  public AppView endpointDocumentation(URI endpointDocumentation) {
    
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


  public AppView distributionService(URI distributionService) {
    
    this.distributionService = distributionService;
    return this;
  }

   /**
   * Get distributionService
   * @return distributionService
  **/
  @javax.annotation.Nullable
  public URI getDistributionService() {
    return distributionService;
  }


  public void setDistributionService(URI distributionService) {
    this.distributionService = distributionService;
  }


  public AppView runtimeEnvironment(String runtimeEnvironment) {
    
    this.runtimeEnvironment = runtimeEnvironment;
    return this;
  }

   /**
   * Get runtimeEnvironment
   * @return runtimeEnvironment
  **/
  @javax.annotation.Nullable
  public String getRuntimeEnvironment() {
    return runtimeEnvironment;
  }


  public void setRuntimeEnvironment(String runtimeEnvironment) {
    this.runtimeEnvironment = runtimeEnvironment;
  }


  public AppView additional(Map<String, String> additional) {
    
    this.additional = additional;
    return this;
  }

  public AppView putAdditionalItem(String key, String additionalItem) {
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


  public AppView links(Map<String, Link> links) {
    
    this.links = links;
    return this;
  }

  public AppView putLinksItem(String key, Link linksItem) {
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
    AppView appView = (AppView) o;
    return Objects.equals(this.creationDate, appView.creationDate) &&
        Objects.equals(this.modificationDate, appView.modificationDate) &&
        Objects.equals(this.title, appView.title) &&
        Objects.equals(this.description, appView.description) &&
        Objects.equals(this.remoteId, appView.remoteId) &&
        Objects.equals(this.remoteAddress, appView.remoteAddress) &&
        Objects.equals(this.docs, appView.docs) &&
        Objects.equals(this.envVariables, appView.envVariables) &&
        Objects.equals(this.storageConfig, appView.storageConfig) &&
        Objects.equals(this.supportedPolicies, appView.supportedPolicies) &&
        Objects.equals(this.keywords, appView.keywords) &&
        Objects.equals(this.publisher, appView.publisher) &&
        Objects.equals(this.sovereign, appView.sovereign) &&
        Objects.equals(this.language, appView.language) &&
        Objects.equals(this.license, appView.license) &&
        Objects.equals(this.endpointDocumentation, appView.endpointDocumentation) &&
        Objects.equals(this.distributionService, appView.distributionService) &&
        Objects.equals(this.runtimeEnvironment, appView.runtimeEnvironment) &&
        Objects.equals(this.additional, appView.additional) &&
        Objects.equals(this.links, appView.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, modificationDate, title, description, remoteId, remoteAddress, docs, envVariables, storageConfig, supportedPolicies, keywords, publisher, sovereign, language, license, endpointDocumentation, distributionService, runtimeEnvironment, additional, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppView {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
    sb.append("    storageConfig: ").append(toIndentedString(storageConfig)).append("\n");
    sb.append("    supportedPolicies: ").append(toIndentedString(supportedPolicies)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    sovereign: ").append(toIndentedString(sovereign)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    endpointDocumentation: ").append(toIndentedString(endpointDocumentation)).append("\n");
    sb.append("    distributionService: ").append(toIndentedString(distributionService)).append("\n");
    sb.append("    runtimeEnvironment: ").append(toIndentedString(runtimeEnvironment)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("remoteId");
    openapiFields.add("remoteAddress");
    openapiFields.add("docs");
    openapiFields.add("envVariables");
    openapiFields.add("storageConfig");
    openapiFields.add("supportedPolicies");
    openapiFields.add("keywords");
    openapiFields.add("publisher");
    openapiFields.add("sovereign");
    openapiFields.add("language");
    openapiFields.add("license");
    openapiFields.add("endpointDocumentation");
    openapiFields.add("distributionService");
    openapiFields.add("runtimeEnvironment");
    openapiFields.add("additional");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppView
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppView.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppView is not found in the empty JSON string", AppView.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppView.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppView` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("remoteId") != null && !jsonObj.get("remoteId").isJsonNull()) && !jsonObj.get("remoteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteId").toString()));
      }
      if ((jsonObj.get("remoteAddress") != null && !jsonObj.get("remoteAddress").isJsonNull()) && !jsonObj.get("remoteAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteAddress").toString()));
      }
      if ((jsonObj.get("docs") != null && !jsonObj.get("docs").isJsonNull()) && !jsonObj.get("docs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docs").toString()));
      }
      if ((jsonObj.get("envVariables") != null && !jsonObj.get("envVariables").isJsonNull()) && !jsonObj.get("envVariables").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envVariables` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envVariables").toString()));
      }
      if ((jsonObj.get("storageConfig") != null && !jsonObj.get("storageConfig").isJsonNull()) && !jsonObj.get("storageConfig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageConfig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageConfig").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supportedPolicies") != null && !jsonObj.get("supportedPolicies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedPolicies` to be an array in the JSON string but got `%s`", jsonObj.get("supportedPolicies").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      if ((jsonObj.get("publisher") != null && !jsonObj.get("publisher").isJsonNull()) && !jsonObj.get("publisher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publisher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publisher").toString()));
      }
      if ((jsonObj.get("sovereign") != null && !jsonObj.get("sovereign").isJsonNull()) && !jsonObj.get("sovereign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sovereign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sovereign").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull()) && !jsonObj.get("license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license").toString()));
      }
      if ((jsonObj.get("endpointDocumentation") != null && !jsonObj.get("endpointDocumentation").isJsonNull()) && !jsonObj.get("endpointDocumentation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointDocumentation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointDocumentation").toString()));
      }
      if ((jsonObj.get("distributionService") != null && !jsonObj.get("distributionService").isJsonNull()) && !jsonObj.get("distributionService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distributionService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distributionService").toString()));
      }
      if ((jsonObj.get("runtimeEnvironment") != null && !jsonObj.get("runtimeEnvironment").isJsonNull()) && !jsonObj.get("runtimeEnvironment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtimeEnvironment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runtimeEnvironment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppView.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppView' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppView> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppView.class));

       return (TypeAdapter<T>) new TypeAdapter<AppView>() {
           @Override
           public void write(JsonWriter out, AppView value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppView read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppView given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppView
  * @throws IOException if the JSON string is invalid with respect to AppView
  */
  public static AppView fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppView.class);
  }

 /**
  * Convert an instance of AppView to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
