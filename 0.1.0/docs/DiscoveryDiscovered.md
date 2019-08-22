
# DiscoveryDiscovered

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**continuousAnalysis** | [**DiscoveredContinuousAnalysis**](DiscoveredContinuousAnalysis.md) | Whether the resource is continuously analyzed. |  [optional]
**lastAnalysisTime** | [**OffsetDateTime**](OffsetDateTime.md) | The last time continuous analysis was done for this resource. Deprecated, do not use. |  [optional]
**analysisStatus** | [**DiscoveredAnalysisStatus**](DiscoveredAnalysisStatus.md) | The status of discovery for the resource. |  [optional]
**analysisStatusError** | [**RpcStatus**](RpcStatus.md) | When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API. |  [optional]



