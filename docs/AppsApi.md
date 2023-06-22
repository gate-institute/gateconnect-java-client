# AppsApi

All URIs are relative to *https://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**containerManagement**](AppsApi.md#containerManagement) | **PUT** /api/apps/{id}/actions | Actions on apps |
| [**delete15**](AppsApi.md#delete15) | **DELETE** /api/apps/{id} | Delete a base resource by id. |
| [**get15**](AppsApi.md#get15) | **GET** /api/apps/{id} | Get a base resource by id. |
| [**getAll15**](AppsApi.md#getAll15) | **GET** /api/apps | Get a list of base resources with pagination. |
| [**getResource24**](AppsApi.md#getResource24) | **GET** /api/apps/{id}/endpoints | Get all children of a base resource with pagination. |
| [**relatedAppStore**](AppsApi.md#relatedAppStore) | **GET** /api/apps/{id}/appstore | Get appstore by app id |


<a id="containerManagement"></a>
# **containerManagement**
> Object containerManagement(id, type)

Actions on apps

Can be used for managing apps.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppsApi apiInstance = new AppsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String type = "START"; // String | 
    try {
      Object result = apiInstance.containerManagement(id, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#containerManagement");
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
| **type** | **String**|  | [enum: START, STOP, DELETE, DESCRIBE] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |

<a id="delete15"></a>
# **delete15**
> delete15(id)

Delete a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppsApi apiInstance = new AppsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.delete15(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#delete15");
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

<a id="get15"></a>
# **get15**
> AppView get15(id)

Get a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppsApi apiInstance = new AppsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      AppView result = apiInstance.get15(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#get15");
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

[**AppView**](AppView.md)

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

<a id="getAll15"></a>
# **getAll15**
> PagedModelAppView getAll15(page, size)

Get a list of base resources with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppsApi apiInstance = new AppsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelAppView result = apiInstance.getAll15(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getAll15");
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

[**PagedModelAppView**](PagedModelAppView.md)

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

<a id="getResource24"></a>
# **getResource24**
> PagedModelAppEndpointView getResource24(id, page, size)

Get all children of a base resource with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppsApi apiInstance = new AppsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelAppEndpointView result = apiInstance.getResource24(id, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getResource24");
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

[**PagedModelAppEndpointView**](PagedModelAppEndpointView.md)

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

<a id="relatedAppStore"></a>
# **relatedAppStore**
> Object relatedAppStore(id)

Get appstore by app id

Get appstore holding this app.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppsApi apiInstance = new AppsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Object result = apiInstance.relatedAppStore(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#relatedAppStore");
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

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |

