package com.nitin.bankaccount.model.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by tempnisha on 2017-03-10.
 */
public class PinCodeDetails {

    private String pinCode = null;

    public PinCodeDetails() {
    }

    @JsonProperty("pinCode")
    public String getPinCode() {
        return this.pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinCodeDetails {\n");
        sb.append("  pinCode: ").append(this.pinCode).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
