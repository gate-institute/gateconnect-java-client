# AppStoresApi

All URIs are relative to *https://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create13**](AppStoresApi.md#create13) | **POST** /api/appstores | Create a base resource. |
| [**delete14**](AppStoresApi.md#delete14) | **DELETE** /api/appstores/{id} | Delete a base resource by id. |
| [**get14**](AppStoresApi.md#get14) | **GET** /api/appstores/{id} | Get a base resource by id. |
| [**getAll14**](AppStoresApi.md#getAll14) | **GET** /api/appstores | Get a list of base resources with pagination. |
| [**getResource23**](AppStoresApi.md#getResource23) | **GET** /api/appstores/{id}/apps | Get all children of a base resource with pagination. |
| [**update14**](AppStoresApi.md#update14) | **PUT** /api/appstores/{id} | Update a base resource by id. |


<a id="create13"></a>
# **create13**
> AppStoreView create13(appStoreDesc)

Create a base resource.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppStoresApi apiInstance = new AppStoresApi(defaultClient);
    AppStoreDesc appStoreDesc = new AppStoreDesc(); // AppStoreDesc | 
    try {
      AppStoreView result = apiInstance.create13(appStoreDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppStoresApi#create13");
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
| **appStoreDesc** | [**AppStoreDesc**](AppStoreDesc.md)|  | |

### Return type

[**AppStoreView**](AppStoreView.md)

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

<a id="delete14"></a>
# **delete14**
> delete14(id)

Delete a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppStoresApi apiInstance = new AppStoresApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.delete14(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppStoresApi#delete14");
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

<a id="get14"></a>
# **get14**
> AppStoreView get14(id)

Get a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppStoresApi apiInstance = new AppStoresApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      AppStoreView result = apiInstance.get14(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppStoresApi#get14");
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

[**AppStoreView**](AppStoreView.md)

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

<a id="getAll14"></a>
# **getAll14**
> PagedModelAppStoreView getAll14(page, size)

Get a list of base resources with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppStoresApi apiInstance = new AppStoresApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelAppStoreView result = apiInstance.getAll14(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppStoresApi#getAll14");
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

[**PagedModelAppStoreView**](PagedModelAppStoreView.md)

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

<a id="getResource23"></a>
# **getResource23**
> PagedModelAppView getResource23(id, page, size)

Get all children of a base resource with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppStoresApi apiInstance = new AppStoresApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelAppView result = apiInstance.getResource23(id, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppStoresApi#getResource23");
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

<a id="update14"></a>
# **update14**
> AppStoreView update14(id, appStoreDesc)

Update a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.AppStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AppStoresApi apiInstance = new AppStoresApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    AppStoreDesc appStoreDesc = new AppStoreDesc(); // AppStoreDesc | 
    try {
      AppStoreView result = apiInstance.update14(id, appStoreDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppStoresApi#update14");
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
| **appStoreDesc** | [**AppStoreDesc**](AppStoreDesc.md)|  | |

### Return type

[**AppStoreView**](AppStoreView.md)

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

