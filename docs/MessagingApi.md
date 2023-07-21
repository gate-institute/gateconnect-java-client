# MessagingApi

All URIs are relative to *https://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendMessage**](MessagingApi.md#sendMessage) | **PUT** /api/notify | Notify all subscribers. |
| [**sendMessage1**](MessagingApi.md#sendMessage1) | **POST** /api/ids/resource/update | Send an IDS ResourceUpdateMessage. |
| [**sendMessage2**](MessagingApi.md#sendMessage2) | **POST** /api/ids/resource/unavailable | Send an IDS ResourceUnavailableMessage. |
| [**sendMessage3**](MessagingApi.md#sendMessage3) | **POST** /api/ids/description | Send an IDS DescriptionRequestMessage to query metadata. |
| [**sendMessage4**](MessagingApi.md#sendMessage4) | **POST** /api/ids/contract | Send an IDS ContractRequestMessage to start the contract negotiation. |
| [**sendMessage5**](MessagingApi.md#sendMessage5) | **POST** /api/ids/connector/update | Send an IDS ConnectorUpdateMessage. |
| [**sendMessage6**](MessagingApi.md#sendMessage6) | **POST** /api/ids/connector/unavailable | Send an IDS ConnectorUnavailableMessage. |
| [**sendMessage7**](MessagingApi.md#sendMessage7) | **POST** /api/ids/app | Download an IDS app from an IDS AppStore. |
| [**sendQueryMessage**](MessagingApi.md#sendQueryMessage) | **POST** /api/ids/query | Send an IDS QueryMessage. |
| [**sendSearchMessage**](MessagingApi.md#sendSearchMessage) | **POST** /api/ids/search | Perform full-text search. |
| [**subscribe**](MessagingApi.md#subscribe) | **POST** /api/ids/subscribe | Send an IDS request message for subscribing to (meta)data updates. |
| [**unsubscribe**](MessagingApi.md#unsubscribe) | **POST** /api/ids/unsubscribe | Send an IDS request message for unsubscribe from an element. |


<a id="sendMessage"></a>
# **sendMessage**
> Object sendMessage(elementId)

Notify all subscribers.

Can be used to manually notify all subscribers about a resource offer, representation, or artifact update.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI elementId = new URI(); // URI | The element id.
    try {
      Object result = apiInstance.sendMessage(elementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage");
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
| **elementId** | **URI**| The element id. | |

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
| **404** | Not found |  -  |
| **204** | No Content |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |

<a id="sendMessage1"></a>
# **sendMessage1**
> Object sendMessage1(recipient, resourceId)

Send an IDS ResourceUpdateMessage.

Can be used to register or update an IDS resource at an IDS Broker or consumer connector.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    URI resourceId = new URI(); // URI | The resource id.
    try {
      Object result = apiInstance.sendMessage1(recipient, resourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage1");
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
| **recipient** | **URI**| The recipient url. | |
| **resourceId** | **URI**| The resource id. | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **404** | Not found |  -  |
| **504** | Gateway timeout |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendMessage2"></a>
# **sendMessage2**
> Object sendMessage2(recipient, resourceId)

Send an IDS ResourceUnavailableMessage.

Can be used for e.g. unregistering an IDS resource at an IDS Broker.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    URI resourceId = new URI(); // URI | The resource id.
    try {
      Object result = apiInstance.sendMessage2(recipient, resourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage2");
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
| **recipient** | **URI**| The recipient url. | |
| **resourceId** | **URI**| The resource id. | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **404** | Not found |  -  |
| **504** | Gateway timeout |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendMessage3"></a>
# **sendMessage3**
> Object sendMessage3(recipient, elementId)

Send an IDS DescriptionRequestMessage to query metadata.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    URI elementId = new URI(); // URI | The id of the requested resource.
    try {
      Object result = apiInstance.sendMessage3(recipient, elementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage3");
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
| **recipient** | **URI**| The recipient url. | |
| **elementId** | **URI**| The id of the requested resource. | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendMessage4"></a>
# **sendMessage4**
> Object sendMessage4(recipient, resourceIds, artifactIds, download, sendMessage4RequestInner)

Send an IDS ContractRequestMessage to start the contract negotiation.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    List<URI> resourceIds = Arrays.asList(); // List<URI> | List of ids resource that should be requested.
    List<URI> artifactIds = Arrays.asList(); // List<URI> | List of ids artifacts that should be requested.
    Boolean download = true; // Boolean | Indicates whether the connector should automatically download data of an artifact.
    List<SendMessage4RequestInner> sendMessage4RequestInner = Arrays.asList(); // List<SendMessage4RequestInner> | 
    try {
      Object result = apiInstance.sendMessage4(recipient, resourceIds, artifactIds, download, sendMessage4RequestInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage4");
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
| **recipient** | **URI**| The recipient url. | |
| **resourceIds** | [**List&lt;URI&gt;**](URI.md)| List of ids resource that should be requested. | |
| **artifactIds** | [**List&lt;URI&gt;**](URI.md)| List of ids artifacts that should be requested. | |
| **download** | **Boolean**| Indicates whether the connector should automatically download data of an artifact. | |
| **sendMessage4RequestInner** | [**List&lt;SendMessage4RequestInner&gt;**](SendMessage4RequestInner.md)|  | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **201** | Created |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendMessage5"></a>
# **sendMessage5**
> Object sendMessage5(recipient)

Send an IDS ConnectorUpdateMessage.

Can be used for registering or updating the connector at an IDS Broker.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    try {
      Object result = apiInstance.sendMessage5(recipient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage5");
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
| **recipient** | **URI**| The recipient url. | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **504** | Gateway timeout |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendMessage6"></a>
# **sendMessage6**
> Object sendMessage6(recipient)

Send an IDS ConnectorUnavailableMessage.

Can be used for unregistering the connector at an IDS Broker.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    try {
      Object result = apiInstance.sendMessage6(recipient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage6");
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
| **recipient** | **URI**| The recipient url. | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **504** | Gateway timeout |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendMessage7"></a>
# **sendMessage7**
> Object sendMessage7(recipient, appId)

Download an IDS app from an IDS AppStore.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    URI appId = new URI(); // URI | The app id.
    try {
      Object result = apiInstance.sendMessage7(recipient, appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendMessage7");
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
| **recipient** | **URI**| The recipient url. | |
| **appId** | **URI**| The app id. | |

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
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **201** | Created |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendQueryMessage"></a>
# **sendQueryMessage**
> Object sendQueryMessage(recipient, body)

Send an IDS QueryMessage.

Can be used for querying an IDS component (e.g. the IDS Broker).

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    String body = "body_example"; // String | 
    try {
      Object result = apiInstance.sendQueryMessage(recipient, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendQueryMessage");
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
| **recipient** | **URI**| The recipient url. | |
| **body** | **String**|  | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **504** | Gateway timeout |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="sendSearchMessage"></a>
# **sendSearchMessage**
> String sendSearchMessage(recipient, limit, offset, body)

Perform full-text search.

Can be used for full text search at an IDS component (e.g. the Broker).

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    Integer limit = 50; // Integer | The limit value.
    Integer offset = 0; // Integer | The offset value.
    String body = "body_example"; // String | 
    try {
      String result = apiInstance.sendSearchMessage(recipient, limit, offset, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#sendSearchMessage");
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
| **recipient** | **URI**| The recipient url. | |
| **limit** | **Integer**| The limit value. | [default to 50] |
| **offset** | **Integer**| The offset value. | [default to 0] |
| **body** | **String**|  | |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **504** | Gateway timeout |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="subscribe"></a>
# **subscribe**
> Object subscribe(recipient, subscriptionDesc)

Send an IDS request message for subscribing to (meta)data updates.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    SubscriptionDesc subscriptionDesc = new SubscriptionDesc(); // SubscriptionDesc | 
    try {
      Object result = apiInstance.subscribe(recipient, subscriptionDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#subscribe");
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
| **recipient** | **URI**| The recipient url. | |
| **subscriptionDesc** | [**SubscriptionDesc**](SubscriptionDesc.md)|  | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad gateway |  -  |
| **401** | Unauthorized |  -  |

<a id="unsubscribe"></a>
# **unsubscribe**
> Object unsubscribe(recipient, elementId)

Send an IDS request message for unsubscribe from an element.

### Example
```java
// Import classes:
import eu.gateai.gateconnect.client.ApiClient;
import eu.gateai.gateconnect.client.ApiException;
import eu.gateai.gateconnect.client.Configuration;
import eu.gateai.gateconnect.client.auth.*;
import eu.gateai.gateconnect.client.models.*;
import eu.gateai.gateconnect.client.api.MessagingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:8080");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MessagingApi apiInstance = new MessagingApi(defaultClient);
    URI recipient = new URI(); // URI | The recipient url.
    URI elementId = new URI(); // URI | The subscription object.
    try {
      Object result = apiInstance.unsubscribe(recipient, elementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#unsubscribe");
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
| **recipient** | **URI**| The recipient url. | |
| **elementId** | **URI**| The subscription object. | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Ok |  -  |
| **500** | Internal server error |  -  |
| **401** | Unauthorized |  -  |

