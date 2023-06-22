

# OfferedResourceView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**modificationDate** | **OffsetDateTime** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**keywords** | **List&lt;String&gt;** |  |  [optional] |
|**publisher** | **URI** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**license** | **URI** |  |  [optional] |
|**version** | **Long** |  |  [optional] |
|**sovereign** | **URI** |  |  [optional] |
|**endpointDocumentation** | **URI** |  |  [optional] |
|**paymentModality** | [**PaymentModalityEnum**](#PaymentModalityEnum) |  |  [optional] |
|**samples** | **List&lt;URI&gt;** |  |  [optional] |
|**additional** | **Map&lt;String, String&gt;** |  |  [optional] |
|**links** | [**Map&lt;String, Link&gt;**](Link.md) |  |  [optional] |



## Enum: PaymentModalityEnum

| Name | Value |
|---- | -----|
| UNDEFINED | &quot;undefined&quot; |
| FIXEDPRICE | &quot;fixedPrice&quot; |
| FREE | &quot;free&quot; |
| NEGOTIATIONBASIS | &quot;negotiationBasis&quot; |



