
# ApiNote

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**shortDescription** | **String** | A one sentence description of this &#x60;Note&#x60;. |  [optional]
**longDescription** | **String** | A detailed description of this &#x60;Note&#x60;. |  [optional]
**kind** | [**ApiNoteKind**](ApiNoteKind.md) | Output only. This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests. |  [optional]
**vulnerabilityType** | [**ApiVulnerabilityType**](ApiVulnerabilityType.md) | A package vulnerability type of note. |  [optional]
**buildType** | [**ApiBuildType**](ApiBuildType.md) | Build provenance type for a verifiable build. |  [optional]
**baseImage** | [**DockerImageBasis**](DockerImageBasis.md) | A note describing a base image. |  [optional]
**_package** | [**PackageManagerPackage**](PackageManagerPackage.md) | A note describing a package hosted by various package managers. |  [optional]
**deployable** | [**ApiDeployable**](ApiDeployable.md) | A note describing something that can be deployed. |  [optional]
**discovery** | [**ApiDiscovery**](ApiDiscovery.md) | A note describing a provider/analysis type. |  [optional]
**relatedUrl** | [**List&lt;NoteRelatedUrl&gt;**](NoteRelatedUrl.md) |  |  [optional]
**expirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of expiration for this note, null if note does not expire. |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this note was created. This field can be used as a filter in list requests. |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this note was last updated. This field can be used as a filter in list requests. |  [optional]



