# DefaultApi

All URIs are relative to *https://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](DefaultApi.md#authPost) | **POST** /auth/ | Authenticate an application
[**badgesGet**](DefaultApi.md#badgesGet) | **GET** /badges/ | List all badges linked to current application
[**badgesNameDelete**](DefaultApi.md#badgesNameDelete) | **DELETE** /badges/{name}/ | Deletes specific badge
[**badgesNameGet**](DefaultApi.md#badgesNameGet) | **GET** /badges/{name}/ | Fetch specific badge
[**badgesNamePost**](DefaultApi.md#badgesNamePost) | **POST** /badges/{name}/ | Update specific badge
[**badgesPost**](DefaultApi.md#badgesPost) | **POST** /badges/ | Create new badge
[**eventsPost**](DefaultApi.md#eventsPost) | **POST** /events/ | Create an event
[**pointScalesGet**](DefaultApi.md#pointScalesGet) | **GET** /pointScales/ | List point scales linked to current application
[**pointScalesNameDelete**](DefaultApi.md#pointScalesNameDelete) | **DELETE** /pointScales/{name}/ | Deletes specific point scale
[**pointScalesNameGet**](DefaultApi.md#pointScalesNameGet) | **GET** /pointScales/{name}/ | Fetch specific point scale
[**pointScalesNamePost**](DefaultApi.md#pointScalesNamePost) | **POST** /pointScales/{name}/ | Update specific point scale
[**pointScalesPost**](DefaultApi.md#pointScalesPost) | **POST** /pointScales/ | Create point scale
[**registerPost**](DefaultApi.md#registerPost) | **POST** /register/ | Register an application
[**rulesEventsGet**](DefaultApi.md#rulesEventsGet) | **GET** /rules/events/ | List events rules linked to current application
[**rulesEventsNameDelete**](DefaultApi.md#rulesEventsNameDelete) | **DELETE** /rules/events/{name}/ | Delete specific event rule
[**rulesEventsNameGet**](DefaultApi.md#rulesEventsNameGet) | **GET** /rules/events/{name}/ | Fetch specific event rule
[**rulesEventsNamePost**](DefaultApi.md#rulesEventsNamePost) | **POST** /rules/events/{name}/ | Update specific event rule
[**rulesEventsPost**](DefaultApi.md#rulesEventsPost) | **POST** /rules/events/ | Create a new event rule
[**rulesTriggersGet**](DefaultApi.md#rulesTriggersGet) | **GET** /rules/triggers/ | List all trigger rules for current application
[**rulesTriggersNameDelete**](DefaultApi.md#rulesTriggersNameDelete) | **DELETE** /rules/triggers/{name}/ | Delete specific trigger rule
[**rulesTriggersNameGet**](DefaultApi.md#rulesTriggersNameGet) | **GET** /rules/triggers/{name}/ | Fetch specific trigger rule
[**rulesTriggersNamePost**](DefaultApi.md#rulesTriggersNamePost) | **POST** /rules/triggers/{name}/ | Update specific trigger rule
[**rulesTriggersPost**](DefaultApi.md#rulesTriggersPost) | **POST** /rules/triggers/ | Create trigger rule
[**usersGet**](DefaultApi.md#usersGet) | **GET** /users/ | List all users linked to current application
[**usersIdGet**](DefaultApi.md#usersIdGet) | **GET** /users/{id}/ | Fetch specific user


<a name="authPost"></a>
# **authPost**
> Token authPost(body)

Authenticate an application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Credentials body = new Credentials(); // Credentials | Application credentials
try {
    Token result = apiInstance.authPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Credentials**](Credentials.md)| Application credentials |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="badgesGet"></a>
# **badgesGet**
> List&lt;Badge&gt; badgesGet()

List all badges linked to current application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Badge> result = apiInstance.badgesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Badge&gt;**](Badge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="badgesNameDelete"></a>
# **badgesNameDelete**
> badgesNameDelete(name)

Deletes specific badge

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Badge name
try {
    apiInstance.badgesNameDelete(name);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Badge name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="badgesNameGet"></a>
# **badgesNameGet**
> Badge badgesNameGet(name)

Fetch specific badge

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Badge name
try {
    Badge result = apiInstance.badgesNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Badge name |

### Return type

[**Badge**](Badge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="badgesNamePost"></a>
# **badgesNamePost**
> badgesNamePost(name, body)

Update specific badge

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Badge name
Badge body = new Badge(); // Badge | Required informations
try {
    apiInstance.badgesNamePost(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesNamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Badge name |
 **body** | [**Badge**](Badge.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="badgesPost"></a>
# **badgesPost**
> badgesPost(body)

Create new badge

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Badge body = new Badge(); // Badge | Required informations
try {
    apiInstance.badgesPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#badgesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Badge**](Badge.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventsPost"></a>
# **eventsPost**
> eventsPost(body)

Create an event

Create event triggered by user action for a given application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Event body = new Event(); // Event | Required informations
try {
    apiInstance.eventsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Event**](Event.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pointScalesGet"></a>
# **pointScalesGet**
> List&lt;PointScale&gt; pointScalesGet()

List point scales linked to current application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<PointScale> result = apiInstance.pointScalesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PointScale&gt;**](PointScale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pointScalesNameDelete"></a>
# **pointScalesNameDelete**
> pointScalesNameDelete(name)

Deletes specific point scale

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Point scale name
try {
    apiInstance.pointScalesNameDelete(name);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Point scale name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pointScalesNameGet"></a>
# **pointScalesNameGet**
> List&lt;PointScale&gt; pointScalesNameGet(name)

Fetch specific point scale

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Point scale name
try {
    List<PointScale> result = apiInstance.pointScalesNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Point scale name |

### Return type

[**List&lt;PointScale&gt;**](PointScale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pointScalesNamePost"></a>
# **pointScalesNamePost**
> pointScalesNamePost(name, body)

Update specific point scale

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Point scale name
PointScale body = new PointScale(); // PointScale | Required informations
try {
    apiInstance.pointScalesNamePost(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesNamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Point scale name |
 **body** | [**PointScale**](PointScale.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pointScalesPost"></a>
# **pointScalesPost**
> pointScalesPost(body)

Create point scale

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PointScale body = new PointScale(); // PointScale | Required informations
try {
    apiInstance.pointScalesPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pointScalesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PointScale**](PointScale.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerPost"></a>
# **registerPost**
> registerPost(body)

Register an application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
GamifiedApplication body = new GamifiedApplication(); // GamifiedApplication | Required informations
try {
    apiInstance.registerPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#registerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GamifiedApplication**](GamifiedApplication.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesEventsGet"></a>
# **rulesEventsGet**
> List&lt;EventRule&gt; rulesEventsGet()

List events rules linked to current application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<EventRule> result = apiInstance.rulesEventsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesEventsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventRule&gt;**](EventRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesEventsNameDelete"></a>
# **rulesEventsNameDelete**
> rulesEventsNameDelete(name)

Delete specific event rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Event rule name
try {
    apiInstance.rulesEventsNameDelete(name);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesEventsNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Event rule name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesEventsNameGet"></a>
# **rulesEventsNameGet**
> EventRule rulesEventsNameGet(name)

Fetch specific event rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Event rule name
try {
    EventRule result = apiInstance.rulesEventsNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesEventsNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Event rule name |

### Return type

[**EventRule**](EventRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesEventsNamePost"></a>
# **rulesEventsNamePost**
> rulesEventsNamePost(name, body)

Update specific event rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Event rule name
EventRule body = new EventRule(); // EventRule | URL of the modified event rule
try {
    apiInstance.rulesEventsNamePost(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesEventsNamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Event rule name |
 **body** | [**EventRule**](EventRule.md)| URL of the modified event rule |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesEventsPost"></a>
# **rulesEventsPost**
> rulesEventsPost(body)

Create a new event rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
EventRule body = new EventRule(); // EventRule | Required informations
try {
    apiInstance.rulesEventsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesEventsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventRule**](EventRule.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesTriggersGet"></a>
# **rulesTriggersGet**
> List&lt;TriggerRule&gt; rulesTriggersGet()

List all trigger rules for current application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<TriggerRule> result = apiInstance.rulesTriggersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesTriggersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TriggerRule&gt;**](TriggerRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesTriggersNameDelete"></a>
# **rulesTriggersNameDelete**
> rulesTriggersNameDelete(name)

Delete specific trigger rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Trigger rule name
try {
    apiInstance.rulesTriggersNameDelete(name);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesTriggersNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Trigger rule name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesTriggersNameGet"></a>
# **rulesTriggersNameGet**
> TriggerRule rulesTriggersNameGet(name)

Fetch specific trigger rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Trigger rule name
try {
    TriggerRule result = apiInstance.rulesTriggersNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesTriggersNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Trigger rule name |

### Return type

[**TriggerRule**](TriggerRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesTriggersNamePost"></a>
# **rulesTriggersNamePost**
> rulesTriggersNamePost(name, body)

Update specific trigger rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | Trigger rule name
TriggerRule body = new TriggerRule(); // TriggerRule | Modified trigger rule
try {
    apiInstance.rulesTriggersNamePost(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesTriggersNamePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Trigger rule name |
 **body** | [**TriggerRule**](TriggerRule.md)| Modified trigger rule |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rulesTriggersPost"></a>
# **rulesTriggersPost**
> rulesTriggersPost(body)

Create trigger rule

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
TriggerRule body = new TriggerRule(); // TriggerRule | Required informations
try {
    apiInstance.rulesTriggersPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rulesTriggersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TriggerRule**](TriggerRule.md)| Required informations |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersGet"></a>
# **usersGet**
> List&lt;User&gt; usersGet()

List all users linked to current application

List all users linked to current application

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<User> result = apiInstance.usersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersIdGet"></a>
# **usersIdGet**
> User usersIdGet(id)

Fetch specific user

### Example
```java
// Import classes:
//import io.swagger.ApiException;
//import io.swagger.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | User ID
try {
    User result = apiInstance.usersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| User ID |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

