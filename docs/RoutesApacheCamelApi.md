# RoutesApacheCamelApi

All URIs are relative to *https://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBeans**](RoutesApacheCamelApi.md#addBeans) | **POST** /api/beans | Add a bean to the application context. |
| [**addRoutes**](RoutesApacheCamelApi.md#addRoutes) | **POST** /api/camel/routes | Add a route to the Camel context. |
| [**getRouteErrors**](RoutesApacheCamelApi.md#getRouteErrors) | **GET** /api/camel/routes/error | Get new route related errors. |
| [**removeBean**](RoutesApacheCamelApi.md#removeBean) | **DELETE** /api/beans/{beanId} | Remove a bean from the application context. |
| [**removeRoute**](RoutesApacheCamelApi.md#removeRoute) | **DELETE** /api/camel/routes/{routeId} | Delete a route from the Camel context. |


<a id="addBeans"></a>
# **addBeans**
> Object addBeans(addRoutesRequest)

Add a bean to the application context.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.RoutesApacheCamelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RoutesApacheCamelApi apiInstance = new RoutesApacheCamelApi(defaultClient);
    AddRoutesRequest addRoutesRequest = new AddRoutesRequest(); // AddRoutesRequest | 
    try {
      Object result = apiInstance.addBeans(addRoutesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutesApacheCamelApi#addBeans");
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
| **addRoutesRequest** | [**AddRoutesRequest**](AddRoutesRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="addRoutes"></a>
# **addRoutes**
> Object addRoutes(addRoutesRequest)

Add a route to the Camel context.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.RoutesApacheCamelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RoutesApacheCamelApi apiInstance = new RoutesApacheCamelApi(defaultClient);
    AddRoutesRequest addRoutesRequest = new AddRoutesRequest(); // AddRoutesRequest | 
    try {
      Object result = apiInstance.addRoutes(addRoutesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutesApacheCamelApi#addRoutes");
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
| **addRoutesRequest** | [**AddRoutesRequest**](AddRoutesRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |

<a id="getRouteErrors"></a>
# **getRouteErrors**
> Object getRouteErrors()

Get new route related errors.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.RoutesApacheCamelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RoutesApacheCamelApi apiInstance = new RoutesApacheCamelApi(defaultClient);
    try {
      Object result = apiInstance.getRouteErrors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutesApacheCamelApi#getRouteErrors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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
| **401** | Unauthorized |  -  |

<a id="removeBean"></a>
# **removeBean**
> Object removeBean(beanId)

Remove a bean from the application context.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.RoutesApacheCamelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RoutesApacheCamelApi apiInstance = new RoutesApacheCamelApi(defaultClient);
    String beanId = "beanId_example"; // String | 
    try {
      Object result = apiInstance.removeBean(beanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutesApacheCamelApi#removeBean");
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
| **beanId** | **String**|  | |

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
| **401** | Unauthorized |  -  |

<a id="removeRoute"></a>
# **removeRoute**
> Object removeRoute(routeId)

Delete a route from the Camel context.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.RoutesApacheCamelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RoutesApacheCamelApi apiInstance = new RoutesApacheCamelApi(defaultClient);
    String routeId = "routeId_example"; // String | 
    try {
      Object result = apiInstance.removeRoute(routeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutesApacheCamelApi#removeRoute");
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
| **routeId** | **String**|  | |

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
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |

