# CatalogsApi

All URIs are relative to *https://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addResources12**](CatalogsApi.md#addResources12) | **POST** /api/catalogs/{id}/offers | Add a list of children to a base resource. |
| [**create10**](CatalogsApi.md#create10) | **POST** /api/catalogs | Create a base resource. |
| [**delete11**](CatalogsApi.md#delete11) | **DELETE** /api/catalogs/{id} | Delete a base resource by id. |
| [**get11**](CatalogsApi.md#get11) | **GET** /api/catalogs/{id} | Get a base resource by id. |
| [**getAll11**](CatalogsApi.md#getAll11) | **GET** /api/catalogs | Get a list of base resources with pagination. |
| [**getResource18**](CatalogsApi.md#getResource18) | **GET** /api/catalogs/{id}/offers | Get all children of a base resource with pagination. |
| [**removeResources12**](CatalogsApi.md#removeResources12) | **DELETE** /api/catalogs/{id}/offers | Remove a list of children from a base resource. |
| [**replaceResources12**](CatalogsApi.md#replaceResources12) | **PUT** /api/catalogs/{id}/offers | Replace the children of a base resource. |
| [**update11**](CatalogsApi.md#update11) | **PUT** /api/catalogs/{id} | Update a base resource by id. |


<a id="addResources12"></a>
# **addResources12**
> PagedModelOfferedResourceView addResources12(id, URI)

Add a list of children to a base resource.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    List<URI> URI = Arrays.asList(); // List<URI> | 
    try {
      PagedModelOfferedResourceView result = apiInstance.addResources12(id, URI);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#addResources12");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **URI** | [**List&lt;URI&gt;**](URI.md)|  | |

### Return type

[**PagedModelOfferedResourceView**](PagedModelOfferedResourceView.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |

<a id="create10"></a>
# **create10**
> CatalogView create10(catalogDesc)

Create a base resource.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    CatalogDesc catalogDesc = new CatalogDesc(); // CatalogDesc | 
    try {
      CatalogView result = apiInstance.create10(catalogDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#create10");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogDesc** | [**CatalogDesc**](CatalogDesc.md)|  | |

### Return type

[**CatalogView**](CatalogView.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |

<a id="delete11"></a>
# **delete11**
> delete11(id)

Delete a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.delete11(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#delete11");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |

<a id="get11"></a>
# **get11**
> CatalogView get11(id)

Get a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CatalogView result = apiInstance.get11(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#get11");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**CatalogView**](CatalogView.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |

<a id="getAll11"></a>
# **getAll11**
> PagedModelCatalogView getAll11(page, size)

Get a list of base resources with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelCatalogView result = apiInstance.getAll11(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#getAll11");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 30] |

### Return type

[**PagedModelCatalogView**](PagedModelCatalogView.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |

<a id="getResource18"></a>
# **getResource18**
> PagedModelOfferedResourceView getResource18(id, page, size)

Get all children of a base resource with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelOfferedResourceView result = apiInstance.getResource18(id, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#getResource18");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 30] |

### Return type

[**PagedModelOfferedResourceView**](PagedModelOfferedResourceView.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |

<a id="removeResources12"></a>
# **removeResources12**
> removeResources12(id, URI)

Remove a list of children from a base resource.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    List<URI> URI = Arrays.asList(); // List<URI> | 
    try {
      apiInstance.removeResources12(id, URI);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#removeResources12");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **URI** | [**List&lt;URI&gt;**](URI.md)|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |

<a id="replaceResources12"></a>
# **replaceResources12**
> replaceResources12(id, URI)

Replace the children of a base resource.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    List<URI> URI = Arrays.asList(); // List<URI> | 
    try {
      apiInstance.replaceResources12(id, URI);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#replaceResources12");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **URI** | [**List&lt;URI&gt;**](URI.md)|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |

<a id="update11"></a>
# **update11**
> CatalogView update11(id, catalogDesc)

Update a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.CatalogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CatalogsApi apiInstance = new CatalogsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CatalogDesc catalogDesc = new CatalogDesc(); // CatalogDesc | 
    try {
      CatalogView result = apiInstance.update11(id, catalogDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogsApi#update11");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **catalogDesc** | [**CatalogDesc**](CatalogDesc.md)|  | |

### Return type

[**CatalogView**](CatalogView.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |

