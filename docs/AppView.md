

# AppView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**modificationDate** | **OffsetDateTime** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**remoteId** | **URI** |  |  [optional] |
|**remoteAddress** | **URI** |  |  [optional] |
|**docs** | **String** |  |  [optional] |
|**envVariables** | **String** |  |  [optional] |
|**storageConfig** | **String** |  |  [optional] |
|**supportedPolicies** | [**List&lt;SupportedPoliciesEnum&gt;**](#List&lt;SupportedPoliciesEnum&gt;) |  |  [optional] |
|**keywords** | **List&lt;String&gt;** |  |  [optional] |
|**publisher** | **URI** |  |  [optional] |
|**sovereign** | **URI** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**license** | **URI** |  |  [optional] |
|**endpointDocumentation** | **URI** |  |  [optional] |
|**distributionService** | **URI** |  |  [optional] |
|**runtimeEnvironment** | **String** |  |  [optional] |
|**additional** | **Map&lt;String, String&gt;** |  |  [optional] |
|**links** | [**Map&lt;String, Link&gt;**](Link.md) |  |  [optional] |



## Enum: List&lt;SupportedPoliciesEnum&gt;

| Name | Value |
|---- | -----|
| PROVIDE_ACCESS | &quot;PROVIDE_ACCESS&quot; |
| PROHIBIT_ACCESS | &quot;PROHIBIT_ACCESS&quot; |
| N_TIMES_USAGE | &quot;N_TIMES_USAGE&quot; |
| DURATION_USAGE | &quot;DURATION_USAGE&quot; |
| USAGE_DURING_INTERVAL | &quot;USAGE_DURING_INTERVAL&quot; |
| USAGE_UNTIL_DELETION | &quot;USAGE_UNTIL_DELETION&quot; |
| USAGE_LOGGING | &quot;USAGE_LOGGING&quot; |
| USAGE_NOTIFICATION | &quot;USAGE_NOTIFICATION&quot; |
| CONNECTOR_RESTRICTED_USAGE | &quot;CONNECTOR_RESTRICTED_USAGE&quot; |
| SECURITY_PROFILE_RESTRICTED_USAGE | &quot;SECURITY_PROFILE_RESTRICTED_USAGE&quot; |



