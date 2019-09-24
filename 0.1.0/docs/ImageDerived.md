
# ImageDerived

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fingerprint** | [**ImageFingerprint**](ImageFingerprint.md) | Required. The fingerprint of the derived image. |  [optional]
**distance** | **Integer** | Output only. The number of layers by which this image differs from the associated image basis. |  [optional]
**layerInfo** | [**List&lt;ImageLayer&gt;**](ImageLayer.md) | This contains layer-specific metadata, if populated it has length \&quot;distance\&quot; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer. |  [optional]
**baseResourceUrl** | **String** | Output only. This contains the base image URL for the derived image occurrence. |  [optional]



