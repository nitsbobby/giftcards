package com.nitin.deliveryoptions;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by tempnisha on 2017-03-10.
 */
public class RequestContext {

    public static final String REQUEST_CUSTOMER_NUMBER = "customerNumber";
    public static final String REQUEST_MARKET = "market";
    public static final String REQUEST_LANGUAGE = "languageCode";
    public static final String REQUEST_TOUCHPOINT = "touchpoint";
    public static final String REQUEST_WIREMOCK_URL = "wiremockUrl";

    public String getMarket() {
        return getRequestAttribute(REQUEST_MARKET);
    }

    public String getTouchpoint() {
        return getRequestAttribute(REQUEST_TOUCHPOINT);
    }

    public String getLanguageCode() {
        return getRequestAttribute(REQUEST_LANGUAGE);
    }

    public String getCustomerNumber() {
        return getRequestAttribute(REQUEST_CUSTOMER_NUMBER);
    }

    public String getWiremockUrl() {
        return getRequestAttribute(REQUEST_WIREMOCK_URL);
    }

    private static String getRequestAttribute(String key) {
        return (String) RequestContextHolder.currentRequestAttributes().getAttribute(key, RequestAttributes.SCOPE_REQUEST);
    }
}
