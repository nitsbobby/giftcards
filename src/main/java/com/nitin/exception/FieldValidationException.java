package com.nitin.exception;

/**
 * Created by tempnisha on 2017-03-10.
 */
public class FieldValidationException extends Throwable {

    private static final long serialVersionUID = 5267313832352825980L;

    public FieldValidationException(String postCode, String postCode1) {

        super(String.format("Field '%s', invalid value: %s", postCode, postCode1));
    }
}
