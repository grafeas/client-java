# GrafeasV1Beta1Api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCreateNotes**](GrafeasV1Beta1Api.md#batchCreateNotes) | **POST** /v1beta1/{parent&#x3D;projects/*}/notes:batchCreate | Creates new notes in batch.
[**batchCreateOccurrences**](GrafeasV1Beta1Api.md#batchCreateOccurrences) | **POST** /v1beta1/{parent&#x3D;projects/*}/occurrences:batchCreate | Creates new occurrences in batch.
[**createNote**](GrafeasV1Beta1Api.md#createNote) | **POST** /v1beta1/{parent&#x3D;projects/*}/notes | Creates a new note.
[**createOccurrence**](GrafeasV1Beta1Api.md#createOccurrence) | **POST** /v1beta1/{parent&#x3D;projects/*}/occurrences | Creates a new occurrence.
[**deleteNote**](GrafeasV1Beta1Api.md#deleteNote) | **DELETE** /v1beta1/{name&#x3D;projects/*/notes/*} | Deletes the specified note.
[**deleteOccurrence**](GrafeasV1Beta1Api.md#deleteOccurrence) | **DELETE** /v1beta1/{name&#x3D;projects/*/occurrences/*} | Deletes the specified occurrence. For example, use this method to delete an occurrence when the occurrence is no longer applicable for the given resource.
[**getNote**](GrafeasV1Beta1Api.md#getNote) | **GET** /v1beta1/{name&#x3D;projects/*/notes/*} | Gets the specified note.
[**getOccurrence**](GrafeasV1Beta1Api.md#getOccurrence) | **GET** /v1beta1/{name&#x3D;projects/*/occurrences/*} | Gets the specified occurrence.
[**getOccurrenceNote**](GrafeasV1Beta1Api.md#getOccurrenceNote) | **GET** /v1beta1/{name&#x3D;projects/*/occurrences/*}/notes | Gets the note attached to the specified occurrence. Consumer projects can use this method to get a note that belongs to a provider project.
[**getVulnerabilityOccurrencesSummary**](GrafeasV1Beta1Api.md#getVulnerabilityOccurrencesSummary) | **GET** /v1beta1/{parent&#x3D;projects/*}/occurrences:vulnerabilitySummary | Gets a summary of the number and severity of occurrences.
[**listNoteOccurrences**](GrafeasV1Beta1Api.md#listNoteOccurrences) | **GET** /v1beta1/{name&#x3D;projects/*/notes/*}/occurrences | Lists occurrences referencing the specified note. Provider projects can use this method to get all occurrences across consumer projects referencing the specified note.
[**listNotes**](GrafeasV1Beta1Api.md#listNotes) | **GET** /v1beta1/{parent&#x3D;projects/*}/notes | Lists notes for the specified project.
[**listOccurrences**](GrafeasV1Beta1Api.md#listOccurrences) | **GET** /v1beta1/{parent&#x3D;projects/*}/occurrences | Lists occurrences for the specified project.
[**updateNote**](GrafeasV1Beta1Api.md#updateNote) | **PATCH** /v1beta1/{name&#x3D;projects/*/notes/*} | Updates the specified note.
[**updateOccurrence**](GrafeasV1Beta1Api.md#updateOccurrence) | **PATCH** /v1beta1/{name&#x3D;projects/*/occurrences/*} | Updates the specified occurrence.


<a name="batchCreateNotes"></a>
# **batchCreateNotes**
> V1beta1BatchCreateNotesResponse batchCreateNotes(parent, body)

Creates new notes in batch.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String parent = "parent_example"; // String | The name of the project in the form of `projects/[PROJECT_ID]`, under which the notes are to be created.
V1beta1BatchCreateNotesRequest body = new V1beta1BatchCreateNotesRequest(); // V1beta1BatchCreateNotesRequest | 
try {
    V1beta1BatchCreateNotesResponse result = apiInstance.batchCreateNotes(parent, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#batchCreateNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**| The name of the project in the form of &#x60;projects/[PROJECT_ID]&#x60;, under which the notes are to be created. |
 **body** | [**V1beta1BatchCreateNotesRequest**](V1beta1BatchCreateNotesRequest.md)|  |

### Return type

[**V1beta1BatchCreateNotesResponse**](V1beta1BatchCreateNotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchCreateOccurrences"></a>
# **batchCreateOccurrences**
> V1beta1BatchCreateOccurrencesResponse batchCreateOccurrences(parent, body)

Creates new occurrences in batch.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String parent = "parent_example"; // String | The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrences are to be created.
V1beta1BatchCreateOccurrencesRequest body = new V1beta1BatchCreateOccurrencesRequest(); // V1beta1BatchCreateOccurrencesRequest | 
try {
    V1beta1BatchCreateOccurrencesResponse result = apiInstance.batchCreateOccurrences(parent, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#batchCreateOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**| The name of the project in the form of &#x60;projects/[PROJECT_ID]&#x60;, under which the occurrences are to be created. |
 **body** | [**V1beta1BatchCreateOccurrencesRequest**](V1beta1BatchCreateOccurrencesRequest.md)|  |

### Return type

[**V1beta1BatchCreateOccurrencesResponse**](V1beta1BatchCreateOccurrencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNote"></a>
# **createNote**
> V1beta1Note createNote(parent, body)

Creates a new note.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String parent = "parent_example"; // String | The name of the project in the form of `projects/[PROJECT_ID]`, under which the note is to be created.
V1beta1Note body = new V1beta1Note(); // V1beta1Note | The note to create.
try {
    V1beta1Note result = apiInstance.createNote(parent, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#createNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**| The name of the project in the form of &#x60;projects/[PROJECT_ID]&#x60;, under which the note is to be created. |
 **body** | [**V1beta1Note**](V1beta1Note.md)| The note to create. |

### Return type

[**V1beta1Note**](V1beta1Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOccurrence"></a>
# **createOccurrence**
> V1beta1Occurrence createOccurrence(parent, body)

Creates a new occurrence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String parent = "parent_example"; // String | The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrence is to be created.
V1beta1Occurrence body = new V1beta1Occurrence(); // V1beta1Occurrence | The occurrence to create.
try {
    V1beta1Occurrence result = apiInstance.createOccurrence(parent, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#createOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**| The name of the project in the form of &#x60;projects/[PROJECT_ID]&#x60;, under which the occurrence is to be created. |
 **body** | [**V1beta1Occurrence**](V1beta1Occurrence.md)| The occurrence to create. |

### Return type

[**V1beta1Occurrence**](V1beta1Occurrence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNote"></a>
# **deleteNote**
> Object deleteNote(name)

Deletes the specified note.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
try {
    Object result = apiInstance.deleteNote(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#deleteNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the note in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOccurrence"></a>
# **deleteOccurrence**
> Object deleteOccurrence(name)

Deletes the specified occurrence. For example, use this method to delete an occurrence when the occurrence is no longer applicable for the given resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
try {
    Object result = apiInstance.deleteOccurrence(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#deleteOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the occurrence in the form of &#x60;projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]&#x60;. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNote"></a>
# **getNote**
> V1beta1Note getNote(name)

Gets the specified note.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
try {
    V1beta1Note result = apiInstance.getNote(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#getNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the note in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. |

### Return type

[**V1beta1Note**](V1beta1Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOccurrence"></a>
# **getOccurrence**
> V1beta1Occurrence getOccurrence(name)

Gets the specified occurrence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
try {
    V1beta1Occurrence result = apiInstance.getOccurrence(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#getOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the occurrence in the form of &#x60;projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]&#x60;. |

### Return type

[**V1beta1Occurrence**](V1beta1Occurrence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOccurrenceNote"></a>
# **getOccurrenceNote**
> V1beta1Note getOccurrenceNote(name)

Gets the note attached to the specified occurrence. Consumer projects can use this method to get a note that belongs to a provider project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
try {
    V1beta1Note result = apiInstance.getOccurrenceNote(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#getOccurrenceNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the occurrence in the form of &#x60;projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]&#x60;. |

### Return type

[**V1beta1Note**](V1beta1Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVulnerabilityOccurrencesSummary"></a>
# **getVulnerabilityOccurrencesSummary**
> V1beta1VulnerabilityOccurrencesSummary getVulnerabilityOccurrencesSummary(parent, filter)

Gets a summary of the number and severity of occurrences.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String parent = "parent_example"; // String | The name of the project to get a vulnerability summary for in the form of `projects/[PROJECT_ID]`.
String filter = "filter_example"; // String | The filter expression.
try {
    V1beta1VulnerabilityOccurrencesSummary result = apiInstance.getVulnerabilityOccurrencesSummary(parent, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#getVulnerabilityOccurrencesSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**| The name of the project to get a vulnerability summary for in the form of &#x60;projects/[PROJECT_ID]&#x60;. |
 **filter** | **String**| The filter expression. | [optional]

### Return type

[**V1beta1VulnerabilityOccurrencesSummary**](V1beta1VulnerabilityOccurrencesSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNoteOccurrences"></a>
# **listNoteOccurrences**
> V1beta1ListNoteOccurrencesResponse listNoteOccurrences(name, filter, pageSize, pageToken)

Lists occurrences referencing the specified note. Provider projects can use this method to get all occurrences across consumer projects referencing the specified note.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the note to list occurrences for in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of occurrences to return in the list.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    V1beta1ListNoteOccurrencesResponse result = apiInstance.listNoteOccurrences(name, filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#listNoteOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the note to list occurrences for in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. |
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of occurrences to return in the list. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**V1beta1ListNoteOccurrencesResponse**](V1beta1ListNoteOccurrencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNotes"></a>
# **listNotes**
> V1beta1ListNotesResponse listNotes(parent, filter, pageSize, pageToken)

Lists notes for the specified project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String parent = "parent_example"; // String | The name of the project to list notes for in the form of `projects/[PROJECT_ID]`.
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of notes to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    V1beta1ListNotesResponse result = apiInstance.listNotes(parent, filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#listNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**| The name of the project to list notes for in the form of &#x60;projects/[PROJECT_ID]&#x60;. |
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of notes to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**V1beta1ListNotesResponse**](V1beta1ListNotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOccurrences"></a>
# **listOccurrences**
> V1beta1ListOccurrencesResponse listOccurrences(parent, filter, pageSize, pageToken)

Lists occurrences for the specified project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String parent = "parent_example"; // String | The name of the project to list occurrences for in the form of `projects/[PROJECT_ID]`.
String filter = "filter_example"; // String | The filter expression.
Integer pageSize = 56; // Integer | Number of occurrences to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
String pageToken = "pageToken_example"; // String | Token to provide to skip to a particular spot in the list.
try {
    V1beta1ListOccurrencesResponse result = apiInstance.listOccurrences(parent, filter, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#listOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent** | **String**| The name of the project to list occurrences for in the form of &#x60;projects/[PROJECT_ID]&#x60;. |
 **filter** | **String**| The filter expression. | [optional]
 **pageSize** | **Integer**| Number of occurrences to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20. | [optional]
 **pageToken** | **String**| Token to provide to skip to a particular spot in the list. | [optional]

### Return type

[**V1beta1ListOccurrencesResponse**](V1beta1ListOccurrencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNote"></a>
# **updateNote**
> V1beta1Note updateNote(name, body)

Updates the specified note.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
V1beta1Note body = new V1beta1Note(); // V1beta1Note | The updated note.
try {
    V1beta1Note result = apiInstance.updateNote(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#updateNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the note in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;. |
 **body** | [**V1beta1Note**](V1beta1Note.md)| The updated note. |

### Return type

[**V1beta1Note**](V1beta1Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOccurrence"></a>
# **updateOccurrence**
> V1beta1Occurrence updateOccurrence(name, body)

Updates the specified occurrence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GrafeasV1Beta1Api;


GrafeasV1Beta1Api apiInstance = new GrafeasV1Beta1Api();
String name = "name_example"; // String | The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
V1beta1Occurrence body = new V1beta1Occurrence(); // V1beta1Occurrence | The updated occurrence.
try {
    V1beta1Occurrence result = apiInstance.updateOccurrence(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GrafeasV1Beta1Api#updateOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the occurrence in the form of &#x60;projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]&#x60;. |
 **body** | [**V1beta1Occurrence**](V1beta1Occurrence.md)| The updated occurrence. |

### Return type

[**V1beta1Occurrence**](V1beta1Occurrence.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

