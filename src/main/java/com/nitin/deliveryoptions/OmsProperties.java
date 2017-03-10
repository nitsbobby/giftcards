package com.nitin.deliveryoptions;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tempnisha on 2017-03-10.
 */

@Component
@ConfigurationProperties(prefix = "oms", ignoreUnknownFields = false)
public class OmsProperties {

    private boolean dynamicWiremockEnabled = false;
    private final Map<String, String> markets = new HashMap<>();
    private boolean exposeApiDocs;

    public Map<String, String> getMarkets() {
        return markets;
    }

    public boolean isDynamicWiremockEnabled() {
        return dynamicWiremockEnabled;
    }

    public void setDynamicWiremockEnabled(boolean dynamicWiremockEnabled) {
        this.dynamicWiremockEnabled = dynamicWiremockEnabled;
    }

    public String getMarket(RequestContext requestContext) {
        return markets.get(requestContext.getMarket().toLowerCase());
    }

    public boolean getExposeApiDocs() {
        return exposeApiDocs;
    }

    public void setExposeApiDocs(boolean exposeApiDocs) {
        this.exposeApiDocs = exposeApiDocs;
    }
}
