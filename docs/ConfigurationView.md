

# ConfigurationView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**modificationDate** | **OffsetDateTime** |  |  [optional] |
|**connectorId** | **URI** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**defaultEndpoint** | **URI** |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**publicKey** | **String** |  |  [optional] |
|**curator** | **URI** |  |  [optional] |
|**maintainer** | **URI** |  |  [optional] |
|**inboundModelVersion** | **List&lt;String&gt;** |  |  [optional] |
|**outboundModelVersion** | **String** |  |  [optional] |
|**securityProfile** | [**SecurityProfileEnum**](#SecurityProfileEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**logLevel** | [**LogLevelEnum**](#LogLevelEnum) |  |  [optional] |
|**deployMode** | [**DeployModeEnum**](#DeployModeEnum) |  |  [optional] |
|**proxy** | [**ProxyView**](ProxyView.md) |  |  [optional] |
|**trustStore** | [**TruststoreView**](TruststoreView.md) |  |  [optional] |
|**keyStore** | [**KeystoreView**](KeystoreView.md) |  |  [optional] |
|**links** | [**Map&lt;String, Link&gt;**](Link.md) |  |  [optional] |



## Enum: SecurityProfileEnum

| Name | Value |
|---- | -----|
| BASE_SECURITY | &quot;Base Security&quot; |
| TRUST_PLUS_SECURITY | &quot;Trust Plus Security&quot; |
| TRUST_SECURITY | &quot;Trust Security&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FAULTY | &quot;Faulty&quot; |
| OFFLINE | &quot;Offline&quot; |
| ONLINE | &quot;Online&quot; |



## Enum: LogLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;Off&quot; |
| TRACE | &quot;Trace&quot; |
| DEBUG | &quot;Debug&quot; |
| INFO | &quot;Info&quot; |
| WARN | &quot;Warn&quot; |
| ERROR | &quot;Error&quot; |



## Enum: DeployModeEnum

| Name | Value |
|---- | -----|
| PRODUCTIVE | &quot;Productive&quot; |
| TEST | &quot;Test&quot; |



