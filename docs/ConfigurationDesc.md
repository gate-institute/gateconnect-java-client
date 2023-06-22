

# ConfigurationDesc


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**connectorId** | **URI** |  |  [optional] |
|**defaultEndpoint** | **URI** |  |  [optional] [readonly] |
|**version** | **String** |  |  [optional] [readonly] |
|**curator** | **URI** |  |  [optional] |
|**maintainer** | **URI** |  |  [optional] |
|**inboundModelVersion** | **List&lt;String&gt;** |  |  [optional] [readonly] |
|**outboundModelVersion** | **String** |  |  [optional] [readonly] |
|**securityProfile** | [**SecurityProfileEnum**](#SecurityProfileEnum) |  |  [optional] [readonly] |
|**logLevel** | [**LogLevelEnum**](#LogLevelEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**deployMode** | [**DeployModeEnum**](#DeployModeEnum) |  |  [optional] |
|**truststore** | [**TruststoreDesc**](TruststoreDesc.md) |  |  [optional] |
|**proxy** | [**ProxyDesc**](ProxyDesc.md) |  |  [optional] |
|**keystore** | [**KeystoreDesc**](KeystoreDesc.md) |  |  [optional] |



## Enum: SecurityProfileEnum

| Name | Value |
|---- | -----|
| BASE_SECURITY | &quot;Base Security&quot; |
| TRUST_PLUS_SECURITY | &quot;Trust Plus Security&quot; |
| TRUST_SECURITY | &quot;Trust Security&quot; |



## Enum: LogLevelEnum

| Name | Value |
|---- | -----|
| OFF | &quot;Off&quot; |
| TRACE | &quot;Trace&quot; |
| DEBUG | &quot;Debug&quot; |
| INFO | &quot;Info&quot; |
| WARN | &quot;Warn&quot; |
| ERROR | &quot;Error&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FAULTY | &quot;Faulty&quot; |
| OFFLINE | &quot;Offline&quot; |
| ONLINE | &quot;Online&quot; |



## Enum: DeployModeEnum

| Name | Value |
|---- | -----|
| PRODUCTIVE | &quot;Productive&quot; |
| TEST | &quot;Test&quot; |



