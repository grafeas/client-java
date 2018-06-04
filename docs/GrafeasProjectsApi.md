# GrafeasProjectsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](GrafeasProjectsApi.md#createProject) | **POST** /v1alpha1/projects | Creates a new &#x60;Project&#x60;.
[**deleteProject**](GrafeasProjectsApi.md#deleteProject) | **DELETE** /v1alpha1/{name} | Deletes the given &#x60;Project&#x60; from the system.
[**getProject**](GrafeasProjectsApi.md#getProject) | **GET** /v1alpha1/{name} | Returns the requested &#x60;Project&#x60;.
[**listProjects**](GrafeasProjectsApi.md#listProjects) | **GET** /v1alpha1/projects | Lists &#x60;Projects&#x60;


<a name="createProject"></a>
# **createProject**
> ProtobufEmpty createProject(body)

Creates a new &#x60;Project&#x60;.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasProjectsApi;


GrafeasProjectsApi apiInstance = new GrafeasProjectsApi();
ApiProject body = new ApiProject(); // ApiProject | 
try {
    ProtobufEmpty result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasProjectsApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiProject**](ApiProject.md)|  |

### Return type

[**ProtobufEmpty**](ProtobufEmpty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> ProtobufEmpty deleteProject(name)

Deletes the given &#x60;Project&#x60; from the system.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasProjectsApi;


GrafeasProjectsApi apiInstance = new GrafeasProjectsApi();
String name = "name_example"; // String | 
try {
    ProtobufEmpty result = apiInstance.deleteProject(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasProjectsApi#deleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**ProtobufEmpty**](ProtobufEmpty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> ApiProject getProject(name)

Returns the requested &#x60;Project&#x60;.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasProjectsApi;


GrafeasProjectsApi apiInstance = new GrafeasProjectsApi();
String name = "name_example"; // String | 
try {
    ApiProject result = apiInstance.getProject(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasProjectsApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**ApiProject**](ApiProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProjects"></a>
# **listProjects**
> ApiListProjectsResponse listProjects(filter, pageSize, pageToken)

Lists &#x60;Projects&#x60;

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasProjectsApi;


GrafeasProjectsApi apiInstance = new GrafeasProjectsApi();
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of projects to return in the list.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    ApiListProjectsResponse result = apiInstance.listProjects(filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasProjectsApi#listProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of projects to return in the list. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**ApiListProjectsResponse**](ApiListProjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

