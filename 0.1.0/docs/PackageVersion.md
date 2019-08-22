
# PackageVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**epoch** | **Integer** | Used to correct mistakes in the version numbering scheme. |  [optional]
**name** | **String** | Required only when version kind is NORMAL. The main part of the version name. |  [optional]
**revision** | **String** | The iteration of the package build from the above version. |  [optional]
**kind** | [**VersionVersionKind**](VersionVersionKind.md) | Required. Distinguishes between sentinel MIN/MAX versions and normal versions. |  [optional]



