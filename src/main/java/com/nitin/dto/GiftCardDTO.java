package com.nitin.dto;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by tempnisha on 2017-03-09.
 */
@Component
public class GiftCardDTO {

    private String id;
    private String cardNumber;
    private String totalBalance;
    private String remainingAfterPurchase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getRemainingAfterPurchase() {
        return remainingAfterPurchase;
    }

    public void setRemainingAfterPurchase(String remainingAfterPurchase) {
        this.remainingAfterPurchase = remainingAfterPurchase;
    }
}
