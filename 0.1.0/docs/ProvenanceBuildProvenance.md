
# ProvenanceBuildProvenance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Required. Unique identifier of the build. |  [optional]
**projectId** | **String** | ID of the project. |  [optional]
**commands** | [**List&lt;ProvenanceCommand&gt;**](ProvenanceCommand.md) | Commands requested by the build. |  [optional]
**builtArtifacts** | [**List&lt;ProvenanceArtifact&gt;**](ProvenanceArtifact.md) | Output of the build. |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which the build was created. |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which execution of the build was started. |  [optional]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which execution of the build was finished. |  [optional]
**creator** | **String** | E-mail address of the user who initiated this build. Note that this was the user&#39;s e-mail address at the time the build was initiated; this address may not represent the same end-user for all time. |  [optional]
**logsUri** | **String** | URI where any logs for this provenance were written. |  [optional]
**sourceProvenance** | [**ProvenanceSource**](ProvenanceSource.md) | Details of the Source input to the build. |  [optional]
**triggerId** | **String** | Trigger identifier if the build was triggered automatically; empty if not. |  [optional]
**buildOptions** | **Map&lt;String, String&gt;** | Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details. |  [optional]
**builderVersion** | **String** | Version string of the builder at the time this build was executed. |  [optional]



