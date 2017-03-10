package com.nitin.exception;

/**
 * Created by tempnisha on 2017-03-09.
 */
public class DeliveryOptionsException extends Exception {

    private final String errorCode;
    private final String errorMessage;

    public DeliveryOptionsException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
