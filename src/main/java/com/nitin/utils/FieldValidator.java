package com.nitin.utils;

import com.nitin.bankaccount.model.v1.PinCodeDetails;
import com.nitin.bankbranchdelivery.BankPrivateProperties;
import com.nitin.bankbranchdelivery.BankRequestContext;
import com.nitin.exception.FieldValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tempnisha on 2017-03-10.
 */
@Component
public class FieldValidator {

    @Autowired
    private BankPrivateProperties bankPrivateProperties;
    @Autowired
    private BankRequestContext requestContext;

    public String validatePostCode(String pinCodeDetails) throws FieldValidationException {
        if (true) {//getMarket().getSearchPostCodePattern().matcher(pinCodeDetails).matches()
           pinCodeDetails.replace(" ", "").toUpperCase();
           return pinCodeDetails;
        }
        throw new FieldValidationException("pinCodeDetails", pinCodeDetails.toString());
    }

    private String getMarket() {

        return bankPrivateProperties.getMarket(requestContext);
    }
}
