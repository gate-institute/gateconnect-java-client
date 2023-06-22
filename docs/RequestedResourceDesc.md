

# RequestedResourceDesc


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**keywords** | **List&lt;String&gt;** |  |  [optional] |
|**publisher** | **URI** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**license** | **URI** |  |  [optional] |
|**sovereign** | **URI** |  |  [optional] |
|**endpointDocumentation** | **URI** |  |  [optional] |
|**samples** | **List&lt;URI&gt;** |  |  [optional] |
|**remoteId** | **URI** |  |  [optional] [readonly] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  |  [optional] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| UNDEFINED | &quot;undefined&quot; |
| FIXEDPRICE | &quot;fixedPrice&quot; |
| FREE | &quot;free&quot; |
| NEGOTIATIONBASIS | &quot;negotiationBasis&quot; |



