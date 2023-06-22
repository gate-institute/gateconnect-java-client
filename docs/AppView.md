

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
| PROVIDE_UNRESTRICTED_DATA_ACCESS | &quot;Provide unrestricted data access&quot; |
| PROHIBIT_THE_DATA_ACCESS | &quot;Prohibit the data access&quot; |
| RESTRICT_THE_DATA_USAGE_TO_NOT_MORE_THAN_N_TIMES | &quot;Restrict the data usage to not more than N times&quot; |
| RESTRICT_THE_DATA_USAGE_TO_A_SPECIFIC_TIME_DURATION | &quot;Restrict the data usage to a specific time duration&quot; |
| RESTRICT_THE_DATA_USAGE_TO_A_SPECIFIC_TIME_INTERVAL | &quot;Restrict the data usage to a specific time interval&quot; |
| USE_DATA_AND_DELETE_IT_AT_A_SPECIFIC_DATE_TIME | &quot;Use data and delete it at a specific date time&quot; |
| LOG_THE_DATA_USAGE_INFORMATION | &quot;Log the data usage information&quot; |
| NOTIFY_A_PARTY_OR_A_SPECIFIC_GROUP_OF_USERS_WHEN_THE_DATA_IS_USED | &quot;Notify a party or a specific group of users when the data is used&quot; |
| RESTRICT_THE_DATA_USAGE_TO_A_SPECIFIC_CONNECTOR | &quot;Restrict the data usage to a specific connector&quot; |
| RESTRICT_THE_DATA_USAGE_TO_A_SECURITY_PROFILE | &quot;Restrict the data usage to a security profile&quot; |



