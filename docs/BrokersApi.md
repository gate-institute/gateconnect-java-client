# BrokersApi

All URIs are relative to *https://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create11**](BrokersApi.md#create11) | **POST** /api/brokers | Create a base resource. |
| [**delete12**](BrokersApi.md#delete12) | **DELETE** /api/brokers/{id} | Delete a base resource by id. |
| [**get12**](BrokersApi.md#get12) | **GET** /api/brokers/{id} | Get a base resource by id. |
| [**getAll12**](BrokersApi.md#getAll12) | **GET** /api/brokers | Get a list of base resources with pagination. |
| [**getResource19**](BrokersApi.md#getResource19) | **GET** /api/brokers/{id}/offers | Get all children of a base resource with pagination. |
| [**update12**](BrokersApi.md#update12) | **PUT** /api/brokers/{id} | Update a base resource by id. |


<a id="create11"></a>
# **create11**
> BrokerView create11(brokerDesc)

Create a base resource.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.BrokersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BrokersApi apiInstance = new BrokersApi(defaultClient);
    BrokerDesc brokerDesc = new BrokerDesc(); // BrokerDesc | 
    try {
      BrokerView result = apiInstance.create11(brokerDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokersApi#create11");
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
| **brokerDesc** | [**BrokerDesc**](BrokerDesc.md)|  | |

### Return type

[**BrokerView**](BrokerView.md)

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

<a id="delete12"></a>
# **delete12**
> delete12(id)

Delete a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.BrokersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BrokersApi apiInstance = new BrokersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.delete12(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokersApi#delete12");
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

<a id="get12"></a>
# **get12**
> BrokerView get12(id)

Get a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.BrokersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BrokersApi apiInstance = new BrokersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      BrokerView result = apiInstance.get12(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokersApi#get12");
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

[**BrokerView**](BrokerView.md)

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

<a id="getAll12"></a>
# **getAll12**
> PagedModelBrokerView getAll12(page, size)

Get a list of base resources with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.BrokersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BrokersApi apiInstance = new BrokersApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelBrokerView result = apiInstance.getAll12(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokersApi#getAll12");
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

[**PagedModelBrokerView**](PagedModelBrokerView.md)

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

<a id="getResource19"></a>
# **getResource19**
> PagedModelOfferedResourceView getResource19(id, page, size)

Get all children of a base resource with pagination.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.BrokersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BrokersApi apiInstance = new BrokersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 30; // Integer | 
    try {
      PagedModelOfferedResourceView result = apiInstance.getResource19(id, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokersApi#getResource19");
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

<a id="update12"></a>
# **update12**
> BrokerView update12(id, brokerDesc)

Update a base resource by id.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.BrokersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BrokersApi apiInstance = new BrokersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    BrokerDesc brokerDesc = new BrokerDesc(); // BrokerDesc | 
    try {
      BrokerView result = apiInstance.update12(id, brokerDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokersApi#update12");
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
| **brokerDesc** | [**BrokerDesc**](BrokerDesc.md)|  | |

### Return type

[**BrokerView**](BrokerView.md)

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

