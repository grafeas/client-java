
# ImageFingerprint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**v1Name** | **String** | Required. The layer ID of the final layer in the Docker image&#39;s v1 representation. |  [optional]
**v2Blob** | **List&lt;String&gt;** | Required. The ordered list of v2 blobs that represent a given image. |  [optional]
**v2Name** | **String** | Output only. The name of the image&#39;s v2 blobs computed via:   [bottom] :&#x3D; v2_blob[bottom]   [N] :&#x3D; sha256(v2_blob[N] + \&quot; \&quot; + v2_name[N+1]) Only the name of the final blob is kept. |  [optional]



