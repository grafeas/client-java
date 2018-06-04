# GrafeasApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNote**](GrafeasApi.md#createNote) | **POST** /v1alpha1/{parent}/notes | Creates a new &#x60;Note&#x60;.
[**createOccurrence**](GrafeasApi.md#createOccurrence) | **POST** /v1alpha1/{parent}/occurrences | Creates a new &#x60;Occurrence&#x60;. Use this method to create &#x60;Occurrences&#x60; for a resource.
[**createOperation**](GrafeasApi.md#createOperation) | **POST** /v1alpha1/{parent}/operations | Creates a new &#x60;Operation&#x60;.
[**getOccurrenceNote**](GrafeasApi.md#getOccurrenceNote) | **GET** /v1alpha1/{name}/notes | Gets the &#x60;Note&#x60; attached to the given &#x60;Occurrence&#x60;.
[**listNoteOccurrences**](GrafeasApi.md#listNoteOccurrences) | **GET** /v1alpha1/{name}/occurrences | Lists &#x60;Occurrences&#x60; referencing the specified &#x60;Note&#x60;. Use this method to get all occurrences referencing your &#x60;Note&#x60; across all your customer projects.
[**listNotes**](GrafeasApi.md#listNotes) | **GET** /v1alpha1/{parent}/notes | Lists all &#x60;Notes&#x60; for a given project.
[**listOccurrences**](GrafeasApi.md#listOccurrences) | **GET** /v1alpha1/{parent}/occurrences | Lists active &#x60;Occurrences&#x60; for a given project matching the filters.
[**updateNote**](GrafeasApi.md#updateNote) | **PATCH** /v1alpha1/{name} | Updates an existing &#x60;Note&#x60;.


<a name="createNote"></a>
# **createNote**
> ApiNote createNote(parent, body)

Creates a new &#x60;Note&#x60;.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String parent = "parent_example"; // String | 
ApiNote body = new ApiNote(); // ApiNote | 
try {
    ApiNote result = apiInstance.createNote(parent, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#createNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**|  |
 **body** | [**ApiNote**](ApiNote.md)|  |

### Return type

[**ApiNote**](ApiNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOccurrence"></a>
# **createOccurrence**
> ApiOccurrence createOccurrence(parent, body)

Creates a new &#x60;Occurrence&#x60;. Use this method to create &#x60;Occurrences&#x60; for a resource.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String parent = "parent_example"; // String | 
ApiOccurrence body = new ApiOccurrence(); // ApiOccurrence | 
try {
    ApiOccurrence result = apiInstance.createOccurrence(parent, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#createOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**|  |
 **body** | [**ApiOccurrence**](ApiOccurrence.md)|  |

### Return type

[**ApiOccurrence**](ApiOccurrence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOperation"></a>
# **createOperation**
> LongrunningOperation createOperation(parent, body)

Creates a new &#x60;Operation&#x60;.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String parent = "parent_example"; // String | 
ApiCreateOperationRequest body = new ApiCreateOperationRequest(); // ApiCreateOperationRequest | 
try {
    LongrunningOperation result = apiInstance.createOperation(parent, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#createOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**|  |
 **body** | [**ApiCreateOperationRequest**](ApiCreateOperationRequest.md)|  |

### Return type

[**LongrunningOperation**](LongrunningOperation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOccurrenceNote"></a>
# **getOccurrenceNote**
> ApiNote getOccurrenceNote(name)

Gets the &#x60;Note&#x60; attached to the given &#x60;Occurrence&#x60;.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String name = "name_example"; // String | 
try {
    ApiNote result = apiInstance.getOccurrenceNote(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#getOccurrenceNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**ApiNote**](ApiNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNoteOccurrences"></a>
# **listNoteOccurrences**
> ApiListNoteOccurrencesResponse listNoteOccurrences(name, filter, pageSize, pageToken)

Lists &#x60;Occurrences&#x60; referencing the specified &#x60;Note&#x60;. Use this method to get all occurrences referencing your &#x60;Note&#x60; across all your customer projects.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String name = "name_example"; // String | 
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of notes to return in the list.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    ApiListNoteOccurrencesResponse result = apiInstance.listNoteOccurrences(name, filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#listNoteOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of notes to return in the list. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**ApiListNoteOccurrencesResponse**](ApiListNoteOccurrencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNotes"></a>
# **listNotes**
> ApiListNotesResponse listNotes(parent, filter, pageSize, pageToken)

Lists all &#x60;Notes&#x60; for a given project.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String parent = "parent_example"; // String | 
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of notes to return in the list.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    ApiListNotesResponse result = apiInstance.listNotes(parent, filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#listNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**|  |
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of notes to return in the list. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**ApiListNotesResponse**](ApiListNotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOccurrences"></a>
# **listOccurrences**
> ApiListOccurrencesResponse listOccurrences(parent, filter, pageSize, pageToken)

Lists active &#x60;Occurrences&#x60; for a given project matching the filters.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String parent = "parent_example"; // String | 
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of occurrences to return in the list.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    ApiListOccurrencesResponse result = apiInstance.listOccurrences(parent, filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#listOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**|  |
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of occurrences to return in the list. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**ApiListOccurrencesResponse**](ApiListOccurrencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNote"></a>
# **updateNote**
> ApiNote updateNote(name, body)

Updates an existing &#x60;Note&#x60;.

### Example
```java
// Import classes:
//import io.grafeas.ApiException;
//import io.grafeas.api.GrafeasApi;


GrafeasApi apiInstance = new GrafeasApi();
String name = "name_example"; // String | 
ApiNote body = new ApiNote(); // ApiNote | 
try {
    ApiNote result = apiInstance.updateNote(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasApi#updateNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**ApiNote**](ApiNote.md)|  |

### Return type

[**ApiNote**](ApiNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

