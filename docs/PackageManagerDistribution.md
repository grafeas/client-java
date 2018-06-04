
# PackageManagerDistribution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpeUri** | **String** | The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. |  [optional]
**architecture** | [**PackageManagerArchitecture**](PackageManagerArchitecture.md) |  |  [optional]
**latestVersion** | [**VulnerabilityTypeVersion**](VulnerabilityTypeVersion.md) | The latest available version of this package in this distribution channel. |  [optional]
**maintainer** | **String** | A freeform string denoting the maintainer of this package. |  [optional]
**url** | **String** | The distribution channel-specific homepage for this package. |  [optional]
**description** | **String** | The distribution channel-specific description of this package. |  [optional]



