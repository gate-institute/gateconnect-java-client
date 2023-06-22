

# Rule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**comment** | [**List&lt;TypedLiteral&gt;**](TypedLiteral.md) |  |  [optional] |
|**label** | [**List&lt;TypedLiteral&gt;**](TypedLiteral.md) |  |  [optional] |
|**idsColonTarget** | **URI** |  |  [optional] |
|**idsColonAssigner** | **List&lt;URI&gt;** |  |  [optional] |
|**idsColonAssignee** | **List&lt;URI&gt;** |  |  [optional] |
|**idsColonConstraint** | [**List&lt;RuleIdsConstraintInner&gt;**](RuleIdsConstraintInner.md) |  |  [optional] |
|**idsColonAssetRefinement** | [**RuleIdsAssetRefinement**](RuleIdsAssetRefinement.md) |  |  [optional] |
|**idsColonAction** | [**List&lt;IdsColonActionEnum&gt;**](#List&lt;IdsColonActionEnum&gt;) |  |  |
|**idsColonDescription** | [**List&lt;TypedLiteral&gt;**](TypedLiteral.md) |  |  [optional] |
|**idsColonTitle** | [**List&lt;TypedLiteral&gt;**](TypedLiteral.md) |  |  [optional] |
|**atId** | **URI** |  |  |
|**atType** | **String** |  |  |



## Enum: List&lt;IdsColonActionEnum&gt;

| Name | Value |
|---- | -----|
| AGGREGATE_BY_CONSUMER | &quot;https://w3id.org/idsa/code/AGGREGATE_BY_CONSUMER&quot; |
| AGGREGATE_BY_PROVIDER | &quot;https://w3id.org/idsa/code/AGGREGATE_BY_PROVIDER&quot; |
| ANONYMIZE | &quot;https://w3id.org/idsa/code/ANONYMIZE&quot; |
| COMPENSATE | &quot;https://w3id.org/idsa/code/COMPENSATE&quot; |
| DELETE | &quot;https://w3id.org/idsa/code/DELETE&quot; |
| DISTRIBUTE | &quot;https://w3id.org/idsa/code/DISTRIBUTE&quot; |
| ENCRYPT | &quot;https://w3id.org/idsa/code/ENCRYPT&quot; |
| GRANT_USE | &quot;https://w3id.org/idsa/code/GRANT_USE&quot; |
| LOG | &quot;https://w3id.org/idsa/code/LOG&quot; |
| MODIFY | &quot;https://w3id.org/idsa/code/MODIFY&quot; |
| NEXT_POLICY | &quot;https://w3id.org/idsa/code/NEXT_POLICY&quot; |
| NOTIFY | &quot;https://w3id.org/idsa/code/NOTIFY&quot; |
| READ | &quot;https://w3id.org/idsa/code/READ&quot; |
| TRACK_PROVENANCE | &quot;https://w3id.org/idsa/code/TRACK_PROVENANCE&quot; |
| USE | &quot;https://w3id.org/idsa/code/USE&quot; |
| WRITE | &quot;https://w3id.org/idsa/code/WRITE&quot; |



