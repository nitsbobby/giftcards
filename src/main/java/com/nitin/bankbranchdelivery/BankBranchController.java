package com.nitin.bankbranchdelivery;

import com.nitin.exception.BankBranchException;
import com.nitin.exception.GreetingNotFoundException;
import com.nitin.bankbranch.service.DeliveryOptionsService;
import com.nitin.bankbranch.service.v1.DeliveryOptionsServiceImpl;
import com.nitin.bankaccount.service.BankAccountService;
import com.nitin.bankaccount.service.BankAccountServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tempnisha on 2017-03-08.
 */

@RestController
public class BankBranchController {

    private static Logger logger = Logger.getLogger(BankBranchController.class.getName());
    DeliveryOptionsService deliveryOptionsService = new DeliveryOptionsServiceImpl();
    BankAccountService giftCardService = new BankAccountServiceImpl();

    @RequestMapping("/greetings")
    public String getGreetings() throws GreetingNotFoundException {
        return deliveryOptionsService.getDeliveryOptionGreetingService();
    }

    @RequestMapping("/deliveryOption/{id}")
    public int getDeliveryOptionId(@PathVariable int id) throws BankBranchException {
        return deliveryOptionsService.getDeliveryOptionIdService(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/deliveryOptions")
    public HttpHeaders createAndReturnHttpHeaders() throws BankBranchException {
        return deliveryOptionsService.createHttpHeaders();
    }

    @RequestMapping(method = RequestMethod.GET, value="/{deliveryOption}/{deliveryOptionId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getDeliveryOption(@PathVariable String deliveryOption, @PathVariable Long deliveryOptionId, @RequestParam(value = "date", required = false) String dateOrNull) throws BankBranchException {
        return deliveryOptionsService.getDeliveryOptionService(deliveryOption, deliveryOptionId,dateOrNull);
    }

    @RequestMapping(method = RequestMethod.GET, value="/getAllDeliveryOptions", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllDeliveryOptions() throws BankBranchException {
        return deliveryOptionsService.getAllDeliveryOptionNameService();
    }

    @RequestMapping(method = RequestMethod.GET, value="/getAllDeliveryOptionsByRest", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllDeliveryOptionsByRest() throws BankBranchException {
        return deliveryOptionsService.getAllDeliveryOptionByRestClientService();
    }
}