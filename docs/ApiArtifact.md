
# ApiArtifact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the artifact. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to &#x60;docker push&#x60;.  This field is deprecated in favor of the plural &#x60;names&#x60; field; it continues to exist here to allow existing BuildProvenance serialized to json in google.devtools.containeranalysis.v1alpha1.BuildDetails.provenance_bytes to deserialize back into proto. |  [optional]
**checksum** | **String** | Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container. |  [optional]
**id** | **String** |  |  [optional]
**names** | **List&lt;String&gt;** | Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to &#x60;docker push&#x60;. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image. |  [optional]



