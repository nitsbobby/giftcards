package com.nitin.bankaccount.service;

import com.nitin.dto.BankAccountDTO;

/**
 * Created by tempnisha on 2017-03-09.
 */

public interface BankAccountService {

	public BankAccountDTO getBankAccountDetails(String id);
    public BankAccountDTO addBankAccount(String id);

}
