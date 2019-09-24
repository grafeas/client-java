
# V1beta1Resource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Deprecated, do not use. Use uri instead.  The name of the resource. For example, the name of a Docker image - \&quot;Debian\&quot;. |  [optional]
**uri** | **String** | Required. The unique URI of the resource. For example, &#x60;https://gcr.io/project/image@sha256:foo&#x60; for a Docker image. |  [optional]
**contentHash** | [**ProvenanceHash**](ProvenanceHash.md) | Deprecated, do not use. Use uri instead.  The hash of the resource content. For example, the Docker digest. |  [optional]



