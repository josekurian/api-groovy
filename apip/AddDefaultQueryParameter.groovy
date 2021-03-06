def key = 'pid'      // QueryParameterのkey
def val = 'AUTO-123' // QueryParameterのValue
def queryParams = (Map)context.ApiRequest.getQueryParams()

// No operation when default query parameters are specified
if( queryParams.isEmpty() || !queryParams.containsKey(key)) {
}
else {
    // Add default query parameters unless default query parameters are not specified
    context.ServiceRequest.setQueryParam(key, val)
}
