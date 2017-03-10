package com.nitin.deliveryoptions;

import java.util.regex.Pattern;

/**
 * Created by tempnisha on 2017-03-10.
 */
public class Market {

    public static final Pattern MATCH_NOTHING = Pattern.compile("$.");
    private Pattern mobileNumberPattern = MATCH_NOTHING;
    private Pattern searchPostCodePattern = MATCH_NOTHING;
    private Pattern addressPostCodePattern = MATCH_NOTHING;
    private Pattern cardNumberPattern = MATCH_NOTHING;
    private Pattern pinCodePattern = MATCH_NOTHING;
    private boolean supportsAlternativeDeliveryAddress = false;
    private boolean supportsMobileNumberNotification = true;

    public Pattern getMobileNumberPattern() {
        return mobileNumberPattern;
    }

    public void setMobileNumberPattern(Pattern mobileNumberPattern) {
        this.mobileNumberPattern = mobileNumberPattern;
    }

    public Pattern getSearchPostCodePattern() {
        return searchPostCodePattern;
    }

    public void setSearchPostCodePattern(Pattern searchPostCodePattern) {
        this.searchPostCodePattern = searchPostCodePattern;
    }

    public Pattern getAddressPostCodePattern() {
        return addressPostCodePattern;
    }

    public void setAddressPostCodePattern(Pattern addressPostCodePattern) {
        this.addressPostCodePattern = addressPostCodePattern;
    }

    public boolean getSupportsAlternativeDeliveryAddress() {
        return supportsAlternativeDeliveryAddress;
    }

    public void setSupportsAlternativeDeliveryAddress(boolean supportsAlternativeDeliveryAddress) {
        this.supportsAlternativeDeliveryAddress = supportsAlternativeDeliveryAddress;
    }

    public boolean getSupportsMobileNumberNotification() {
        return supportsMobileNumberNotification;
    }

    public void setSupportsMobileNumberNotification(boolean supportsMobileNumberNotification) {
        this.supportsMobileNumberNotification = supportsMobileNumberNotification;
    }
    public Pattern getCardNumberPattern() {
        return cardNumberPattern;
    }

    public void setCardNumberPattern(Pattern cardNumberPattern) {
        this.cardNumberPattern = cardNumberPattern;
    }

    public Pattern getPinCodePattern() {
        return pinCodePattern;
    }

    public void setPinCodePattern(Pattern pinCodePattern) {
        this.pinCodePattern = pinCodePattern;
    }
}
