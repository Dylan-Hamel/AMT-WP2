# DefaultApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**badgesGet**](DefaultApi.md#badgesGet) | **GET** /badges | List all badges linked to current application
[**badgesIdDelete**](DefaultApi.md#badgesIdDelete) | **DELETE** /badges/{id} | Deletes specific badge
[**badgesIdPut**](DefaultApi.md#badgesIdPut) | **PUT** /badges/{id} | Update a given badge
[**badgesPost**](DefaultApi.md#badgesPost) | **POST** /badges | Create new badge
[**eventsPost**](DefaultApi.md#eventsPost) | **POST** /events | Create an event
[**pointScalesGet**](DefaultApi.md#pointScalesGet) | **GET** /pointScales | List point scales linked to current application
[**pointScalesIdDelete**](DefaultApi.md#pointScalesIdDelete) | **DELETE** /pointScales/{id} | Deletes specific point scale
[**pointScalesIdGet**](DefaultApi.md#pointScalesIdGet) | **GET** /pointScales/{id} | Fetch specific point scale
[**pointScalesIdPut**](DefaultApi.md#pointScalesIdPut) | **PUT** /pointScales/{id} | Update specific point scale
[**pointScalesPost**](DefaultApi.md#pointScalesPost) | **POST** /pointScales | Create point scale
[**rulesGet**](DefaultApi.md#rulesGet) | **GET** /rules/ | List events rules linked to current application
[**rulesIdDelete**](DefaultApi.md#rulesIdDelete) | **DELETE** /rules/{id} | Delete specific event rule
[**rulesIdGet**](DefaultApi.md#rulesIdGet) | **GET** /rules/{id} | Fetch specific event rule
[**rulesIdPut**](DefaultApi.md#rulesIdPut) | **PUT** /rules/{id} | Update specific event rule
[**rulesPost**](DefaultApi.md#rulesPost) | **POST** /rules/ | Create a new event rule
[**usersGet**](DefaultApi.md#usersGet) | **GET** /users | List all users linked to current application
[**usersIdGet**](DefaultApi.md#usersIdGet) | **GET** /users/{id} | Fetch specific user


<a name="badgesGet"></a>
# **badgesGet**
> List&lt;BadgeDTO&gt; badgesGet(xGamificationToken)

List all badges linked to current application

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
try {
    List<BadgeDTO> result = apiInstance.badgesGet(xGamificationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |

### Return type

[**List&lt;BadgeDTO&gt;**](BadgeDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="badgesIdDelete"></a>
# **badgesIdDelete**
> badgesIdDelete(xGamificationToken, id)

Deletes specific badge

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | Badge name
try {
    apiInstance.badgesIdDelete(xGamificationToken, id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| Badge name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="badgesIdPut"></a>
# **badgesIdPut**
> badgesIdPut(xGamificationToken, id, body)

Update a given badge

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | 
BadgeDTO body = new BadgeDTO(); // BadgeDTO | 
try {
    apiInstance.badgesIdPut(xGamificationToken, id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**|  |
 **body** | [**BadgeDTO**](BadgeDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="badgesPost"></a>
# **badgesPost**
> badgesPost(xGamificationToken, body)

Create new badge

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
BadgeDTO body = new BadgeDTO(); // BadgeDTO | Required informations
try {
    apiInstance.badgesPost(xGamificationToken, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **body** | [**BadgeDTO**](BadgeDTO.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="eventsPost"></a>
# **eventsPost**
> eventsPost(xGamificationToken, body)

Create an event

Create event triggered by user action for a given application

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
EventDTO body = new EventDTO(); // EventDTO | Required informations
try {
    apiInstance.eventsPost(xGamificationToken, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **body** | [**EventDTO**](EventDTO.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="pointScalesGet"></a>
# **pointScalesGet**
> List&lt;PointScaleDTO&gt; pointScalesGet(xGamificationToken)

List point scales linked to current application

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
try {
    List<PointScaleDTO> result = apiInstance.pointScalesGet(xGamificationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |

### Return type

[**List&lt;PointScaleDTO&gt;**](PointScaleDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pointScalesIdDelete"></a>
# **pointScalesIdDelete**
> pointScalesIdDelete(xGamificationToken, id)

Deletes specific point scale

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | Point scale name
try {
    apiInstance.pointScalesIdDelete(xGamificationToken, id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| Point scale name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pointScalesIdGet"></a>
# **pointScalesIdGet**
> PointScaleDTO pointScalesIdGet(xGamificationToken, id)

Fetch specific point scale

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | Point scale name
try {
    PointScaleDTO result = apiInstance.pointScalesIdGet(xGamificationToken, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| Point scale name |

### Return type

[**PointScaleDTO**](PointScaleDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pointScalesIdPut"></a>
# **pointScalesIdPut**
> pointScalesIdPut(xGamificationToken, id, body)

Update specific point scale

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | Point scale name
PointScaleDTO body = new PointScaleDTO(); // PointScaleDTO | Required informations
try {
    apiInstance.pointScalesIdPut(xGamificationToken, id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| Point scale name |
 **body** | [**PointScaleDTO**](PointScaleDTO.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="pointScalesPost"></a>
# **pointScalesPost**
> pointScalesPost(xGamificationToken, body)

Create point scale

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
PointScaleDTO body = new PointScaleDTO(); // PointScaleDTO | Required informations
try {
    apiInstance.pointScalesPost(xGamificationToken, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **body** | [**PointScaleDTO**](PointScaleDTO.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="rulesGet"></a>
# **rulesGet**
> List&lt;RuleResponseDTO&gt; rulesGet(xGamificationToken)

List events rules linked to current application

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
try {
    List<RuleResponseDTO> result = apiInstance.rulesGet(xGamificationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |

### Return type

[**List&lt;RuleResponseDTO&gt;**](RuleResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rulesIdDelete"></a>
# **rulesIdDelete**
> rulesIdDelete(xGamificationToken, id)

Delete specific event rule

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | Event rule name
try {
    apiInstance.rulesIdDelete(xGamificationToken, id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| Event rule name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="rulesIdGet"></a>
# **rulesIdGet**
> RuleResponseDTO rulesIdGet(xGamificationToken, id)

Fetch specific event rule

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | Event rule name
try {
    RuleResponseDTO result = apiInstance.rulesIdGet(xGamificationToken, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| Event rule name |

### Return type

[**RuleResponseDTO**](RuleResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rulesIdPut"></a>
# **rulesIdPut**
> rulesIdPut(xGamificationToken, id, body)

Update specific event rule

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | Event rule name
RuleDTO body = new RuleDTO(); // RuleDTO | URL of the modified event rule
try {
    apiInstance.rulesIdPut(xGamificationToken, id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| Event rule name |
 **body** | [**RuleDTO**](RuleDTO.md)| URL of the modified event rule |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="rulesPost"></a>
# **rulesPost**
> rulesPost(xGamificationToken, body)

Create a new event rule

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
RuleDTO body = new RuleDTO(); // RuleDTO | Required informations
try {
    apiInstance.rulesPost(xGamificationToken, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **body** | [**RuleDTO**](RuleDTO.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="usersGet"></a>
# **usersGet**
> List&lt;UserDTO&gt; usersGet(xGamificationToken)

List all users linked to current application

List all users linked to current application

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
try {
    List<UserDTO> result = apiInstance.usersGet(xGamificationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |

### Return type

[**List&lt;UserDTO&gt;**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersIdGet"></a>
# **usersIdGet**
> UserDTO usersIdGet(xGamificationToken, id)

Fetch specific user

### Example
```java
// Import classes:
//import ch.heig.amt.gamification.tests.ApiException;
//import ch.heig.amt.gamification.tests.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String xGamificationToken = "xGamificationToken_example"; // String | Token Auth
Integer id = 56; // Integer | User ID
try {
    UserDTO result = apiInstance.usersIdGet(xGamificationToken, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGamificationToken** | **String**| Token Auth |
 **id** | **Integer**| User ID |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

