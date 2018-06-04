
# ApiOccurrence

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**resourceUrl** | **String** | The unique URL of the image or the container for which the &#x60;Occurrence&#x60; applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests. |  [optional]
**noteName** | **String** | An analysis note associated with this image, in the form \&quot;providers/{provider_id}/notes/{NOTE_ID}\&quot; This field can be used as a filter in list requests. |  [optional]
**kind** | [**ApiNoteKind**](ApiNoteKind.md) | Output only. This explicitly denotes which of the &#x60;Occurrence&#x60; details are specified. This field can be used as a filter in list requests. |  [optional]
**vulnerabilityDetails** | [**VulnerabilityTypeVulnerabilityDetails**](VulnerabilityTypeVulnerabilityDetails.md) | Details of a security vulnerability note. |  [optional]
**buildDetails** | [**ApiBuildDetails**](ApiBuildDetails.md) | Build details for a verifiable build. |  [optional]
**derivedImageDetails** | [**DockerImageDerivedDetails**](DockerImageDerivedDetails.md) | Describes how this resource derives from the basis in the associated note. |  [optional]
**installationDetails** | [**PackageManagerInstallationDetails**](PackageManagerInstallationDetails.md) | Describes the installation of a package on the linked resource. |  [optional]
**deploymentDetails** | [**DeployableDeploymentDetails**](DeployableDeploymentDetails.md) | Describes the deployment of an artifact on a runtime. |  [optional]
**discoveredDetails** | [**DiscoveryDiscoveredDetails**](DiscoveryDiscoveredDetails.md) | Describes the initial scan status for this resource. |  [optional]
**attestationDetails** | [**AttestationAuthorityAttestationDetails**](AttestationAuthorityAttestationDetails.md) | Describes an attestation of an artifact. |  [optional]
**remediation** | **String** |  |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this &#x60;Occurrence&#x60; was created. |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Output only. The time this &#x60;Occurrence&#x60; was last updated. |  [optional]



