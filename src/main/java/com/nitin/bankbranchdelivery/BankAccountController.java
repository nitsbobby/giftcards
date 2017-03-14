package com.nitin.bankbranchdelivery;

import com.nitin.dto.BankAccountDTO;
import com.nitin.bankaccount.model.v1.PinCodeDetails;
import com.nitin.bankaccount.service.BankAccountService;
import com.nitin.exception.FieldValidationException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tempnisha on 2017-03-08.
 */

@RestController
@ComponentScan({"com.nitin.dto.BankAccountDTO"})
public class BankAccountController {

    private static Logger logger = Logger.getLogger(BankAccountController.class.getName());

    @Autowired
    public BankAccountService bankAccountService;

    @Autowired private com.nitin.utils.FieldValidator fieldValidator;

    @RequestMapping("/getbankaccount/{id}")
    public ResponseEntity<BankAccountDTO> getBankAccountDetails(@PathVariable String id){
        logger.info("Inside GiftCardController: " +id);
        return new ResponseEntity<>(bankAccountService.getBankAccountDetails(id), HttpStatus.OK);
    }

    @RequestMapping("/addbankaccount/{id}")
    public ResponseEntity<BankAccountDTO> addBankAccount(@PathVariable("id") String id, @RequestBody PinCodeDetails pinCode){
        logger.info("Inside addbankaccount(): " +id);
        try {
            String validatedPinCodeDetails = fieldValidator.validatePostCode(id);
        } catch (FieldValidationException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<BankAccountDTO>(bankAccountService.addBankAccount(id), HttpStatus.OK);
    }
}