package com.nitin.dto;

import org.springframework.stereotype.Component;

/**
 * Created by tempnisha on 2017-03-09.
 */
@Component
public class BankAccountDTO {

    private String id;
    private String BankAccountNumber;
    private String totalBalance;
    private String remainingAfterPurchase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.BankAccountNumber = bankAccountNumber;
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
