

# Constraint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idsColonRightOperandReference** | **URI** |  |  [optional] |
|**idsColonUnit** | **URI** |  |  [optional] |
|**idsColonOperator** | [**IdsColonOperatorEnum**](#IdsColonOperatorEnum) |  |  |
|**idsColonLeftOperand** | [**IdsColonLeftOperandEnum**](#IdsColonLeftOperandEnum) |  |  |
|**idsColonRightOperand** | [**RdfResource**](RdfResource.md) |  |  [optional] |
|**idsColonPipEndpoint** | **URI** |  |  [optional] |
|**atType** | **String** |  |  |



## Enum: IdsColonOperatorEnum

| Name | Value |
|---- | -----|
| AFTER | &quot;https://w3id.org/idsa/code/AFTER&quot; |
| BEFORE | &quot;https://w3id.org/idsa/code/BEFORE&quot; |
| CONTAINS | &quot;https://w3id.org/idsa/code/CONTAINS&quot; |
| COVERED_BY | &quot;https://w3id.org/idsa/code/COVERED_BY&quot; |
| COVERS | &quot;https://w3id.org/idsa/code/COVERS&quot; |
| DEFINES_AS | &quot;https://w3id.org/idsa/code/DEFINES_AS&quot; |
| DISJOINT | &quot;https://w3id.org/idsa/code/DISJOINT&quot; |
| DURATION_EQ | &quot;https://w3id.org/idsa/code/DURATION_EQ&quot; |
| DURING | &quot;https://w3id.org/idsa/code/DURING&quot; |
| EQ | &quot;https://w3id.org/idsa/code/EQ&quot; |
| EQUALS | &quot;https://w3id.org/idsa/code/EQUALS&quot; |
| FINISHED_BY | &quot;https://w3id.org/idsa/code/FINISHED_BY&quot; |
| FINISHES | &quot;https://w3id.org/idsa/code/FINISHES&quot; |
| GT | &quot;https://w3id.org/idsa/code/GT&quot; |
| GTEQ | &quot;https://w3id.org/idsa/code/GTEQ&quot; |
| HAS_MEMBERSHIP | &quot;https://w3id.org/idsa/code/HAS_MEMBERSHIP&quot; |
| HAS_SITE | &quot;https://w3id.org/idsa/code/HAS_SITE&quot; |
| HAS_STATE | &quot;https://w3id.org/idsa/code/HAS_STATE&quot; |
| IN | &quot;https://w3id.org/idsa/code/IN&quot; |
| INSIDE | &quot;https://w3id.org/idsa/code/INSIDE&quot; |
| INSIDE_NETWORK | &quot;https://w3id.org/idsa/code/INSIDE_NETWORK&quot; |
| LONGER | &quot;https://w3id.org/idsa/code/LONGER&quot; |
| LONGER_EQ | &quot;https://w3id.org/idsa/code/LONGER_EQ&quot; |
| LT | &quot;https://w3id.org/idsa/code/LT&quot; |
| LTEQ | &quot;https://w3id.org/idsa/code/LTEQ&quot; |
| MATCHES | &quot;https://w3id.org/idsa/code/MATCHES&quot; |
| MEETS | &quot;https://w3id.org/idsa/code/MEETS&quot; |
| MEMBER_OF | &quot;https://w3id.org/idsa/code/MEMBER_OF&quot; |
| MET_BY | &quot;https://w3id.org/idsa/code/MET_BY&quot; |
| NOT | &quot;https://w3id.org/idsa/code/NOT&quot; |
| OVERLAPPED_BY | &quot;https://w3id.org/idsa/code/OVERLAPPED_BY&quot; |
| OVERLAPS | &quot;https://w3id.org/idsa/code/OVERLAPS&quot; |
| SAME_AS | &quot;https://w3id.org/idsa/code/SAME_AS&quot; |
| SHORTER | &quot;https://w3id.org/idsa/code/SHORTER&quot; |
| SHORTER_EQ | &quot;https://w3id.org/idsa/code/SHORTER_EQ&quot; |
| SPATIAL_CONTAINS | &quot;https://w3id.org/idsa/code/SPATIAL_CONTAINS&quot; |
| SPATIAL_EQUALS | &quot;https://w3id.org/idsa/code/SPATIAL_EQUALS&quot; |
| SPATIAL_MEET | &quot;https://w3id.org/idsa/code/SPATIAL_MEET&quot; |
| SPATIAL_OVERLAP | &quot;https://w3id.org/idsa/code/SPATIAL_OVERLAP&quot; |
| STARTED_BY | &quot;https://w3id.org/idsa/code/STARTED_BY&quot; |
| STARTS | &quot;https://w3id.org/idsa/code/STARTS&quot; |
| STRING_CONTAINS | &quot;https://w3id.org/idsa/code/STRING_CONTAINS&quot; |
| STRING_EQ | &quot;https://w3id.org/idsa/code/STRING_EQ&quot; |
| STRING_IS_CONTAINED | &quot;https://w3id.org/idsa/code/STRING_IS_CONTAINED&quot; |
| TEMPORAL_DISJOINT | &quot;https://w3id.org/idsa/code/TEMPORAL_DISJOINT&quot; |
| TEMPORAL_EQUALS | &quot;https://w3id.org/idsa/code/TEMPORAL_EQUALS&quot; |



## Enum: IdsColonLeftOperandEnum

| Name | Value |
|---- | -----|
| ABSOLUTE_SPATIAL_POSITION | &quot;https://w3id.org/idsa/code/ABSOLUTE_SPATIAL_POSITION&quot; |
| COUNT | &quot;https://w3id.org/idsa/code/COUNT&quot; |
| DELAY | &quot;https://w3id.org/idsa/code/DELAY&quot; |
| ELAPSED_TIME | &quot;https://w3id.org/idsa/code/ELAPSED_TIME&quot; |
| ENDPOINT | &quot;https://w3id.org/idsa/code/ENDPOINT&quot; |
| EVENT | &quot;https://w3id.org/idsa/code/EVENT&quot; |
| PATH | &quot;https://w3id.org/idsa/code/PATH&quot; |
| PAYMENT | &quot;https://w3id.org/idsa/code/PAYMENT&quot; |
| PAY_AMOUNT | &quot;https://w3id.org/idsa/code/PAY_AMOUNT&quot; |
| POLICY_EVALUATION_TIME | &quot;https://w3id.org/idsa/code/POLICY_EVALUATION_TIME&quot; |
| PURPOSE | &quot;https://w3id.org/idsa/code/PURPOSE&quot; |
| QUANTITY | &quot;https://w3id.org/idsa/code/QUANTITY&quot; |
| RECURRENCE_RATE | &quot;https://w3id.org/idsa/code/RECURRENCE_RATE&quot; |
| SECURITY_LEVEL | &quot;https://w3id.org/idsa/code/SECURITY_LEVEL&quot; |
| STATE | &quot;https://w3id.org/idsa/code/STATE&quot; |
| SYSTEM | &quot;https://w3id.org/idsa/code/SYSTEM&quot; |
| USER | &quot;https://w3id.org/idsa/code/USER&quot; |



