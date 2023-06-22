

# RouteView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**modificationDate** | **OffsetDateTime** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**_configuration** | **String** |  |  [optional] |
|**deploy** | [**DeployEnum**](#DeployEnum) |  |  [optional] |
|**start** | [**Endpoint**](Endpoint.md) |  |  [optional] |
|**end** | [**Endpoint**](Endpoint.md) |  |  [optional] |
|**additional** | **Map&lt;String, String&gt;** |  |  [optional] |
|**links** | [**Map&lt;String, Link&gt;**](Link.md) |  |  [optional] |



## Enum: DeployEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| CAMEL | &quot;Camel&quot; |



