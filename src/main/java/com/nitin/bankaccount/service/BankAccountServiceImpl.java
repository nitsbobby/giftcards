package com.nitin.bankaccount.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.nitin.dto.BankAccountDTO;

/**
 * Created by tempnisha on 2017-03-08.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.nitin"})
@Service
public class BankAccountServiceImpl implements BankAccountService {

    private static Logger logger = Logger.getLogger(BankAccountServiceImpl.class.getName());

    @Autowired
    public BankAccountDTO bankAccountDTO;

    @Override
    public BankAccountDTO getBankAccountDetails(String id) {
        logger.info("Inside getBankAccountDetails() method " +id);
        bankAccountDTO.setId(id);
        bankAccountDTO.setBankAccountNumber("MJK0001");
        bankAccountDTO.setRemainingAfterPurchase("2000");
        bankAccountDTO.setTotalBalance("12000");
        return bankAccountDTO;
    }

    @Override
    public BankAccountDTO addBankAccount(String id) {
        return null;
    }
}