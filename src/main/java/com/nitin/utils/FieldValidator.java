package com.nitin.utils;

import com.nitin.deliveryoptions.Market;
import com.nitin.deliveryoptions.OmsProperties;
import com.nitin.deliveryoptions.RequestContext;
import com.nitin.exception.FieldValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tempnisha on 2017-03-10.
 */
@Component
public class FieldValidator {

    @Autowired
    private OmsProperties omsProperties;
    @Autowired
    private RequestContext requestContext;

    public String validatePostCode(String postCode) throws FieldValidationException {
        if (true) {//getMarket().getSearchPostCodePattern().matcher(postCode).matches()
            return postCode.replace(" ", "").toUpperCase();
        }
        throw new FieldValidationException("postCode", postCode);
    }

    private String getMarket() {

        return omsProperties.getMarket(requestContext);
    }
}
