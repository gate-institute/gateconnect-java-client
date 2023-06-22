# UtilsApi

All URIs are relative to *https://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEnums**](UtilsApi.md#getEnums) | **GET** /api/utils/enums | Get a list of enums by value name. |
| [**getExampleUsagePolicy**](UtilsApi.md#getExampleUsagePolicy) | **POST** /api/examples/policy | Get an example policy for a given policy pattern. |
| [**getPolicyPattern**](UtilsApi.md#getPolicyPattern) | **POST** /api/examples/validation | Get the policy pattern represented by a given JSON string. |


<a id="getEnums"></a>
# **getEnums**
> JSONObject getEnums()

Get a list of enums by value name.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    try {
      JSONObject result = apiInstance.getEnums();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getEnums");
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

[**JSONObject**](JSONObject.md)

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

<a id="getExampleUsagePolicy"></a>
# **getExampleUsagePolicy**
> Object getExampleUsagePolicy(getExampleUsagePolicyRequest)

Get an example policy for a given policy pattern.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    GetExampleUsagePolicyRequest getExampleUsagePolicyRequest = new GetExampleUsagePolicyRequest(); // GetExampleUsagePolicyRequest | 
    try {
      Object result = apiInstance.getExampleUsagePolicy(getExampleUsagePolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getExampleUsagePolicy");
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
| **getExampleUsagePolicyRequest** | [**GetExampleUsagePolicyRequest**](GetExampleUsagePolicyRequest.md)|  | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

<a id="getPolicyPattern"></a>
# **getPolicyPattern**
> Object getPolicyPattern(body)

Get the policy pattern represented by a given JSON string.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      Object result = apiInstance.getPolicyPattern(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#getPolicyPattern");
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
| **body** | **String**|  | |

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
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |

