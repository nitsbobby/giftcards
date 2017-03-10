package com.nitin.deliveryoptions;

import com.nitin.dto.GiftCardDTO;
import com.nitin.giftcard.model.v1.PinCodeDetails;
import com.nitin.giftcard.service.GiftCardService;
import com.nitin.giftcard.service.GiftCardServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tempnisha on 2017-03-08.
 */

@RestController
@ComponentScan({"com.nitin.dto.GiftCardDTO"})
public class GiftCardController {

    private static Logger logger = Logger.getLogger(GiftCardController.class.getName());

    @Autowired
    public GiftCardService giftCardService;

    @Autowired private FieldValidator validator;

    @RequestMapping("/getgiftcards/{id}")
    public ResponseEntity<GiftCardDTO> getGiftCardDetails(@PathVariable String id){
        logger.info("Inside GiftCardController: " +id);
        return new ResponseEntity<>(giftCardService.getGiftCardDetails(id), HttpStatus.OK);
    }

    @RequestMapping("/addgiftcard/{id}")
    public ResponseEntity<GiftCardDTO> addGiftCard(@PathVariable("id") String id, @RequestBody PinCodeDetails pinCode){
        logger.info("Inside addGiftCard: " +id);
        String validatedCardNumber = validator.validateGiftCardNumber(cardNumber);
        PinCodeDetails validatedPinCodeDetails = validator.validateGiftCardPinCode(pinCode);
        return new ResponseEntity<>(giftCardService.addGiftCard(id), HttpStatus.OK);
    }
}