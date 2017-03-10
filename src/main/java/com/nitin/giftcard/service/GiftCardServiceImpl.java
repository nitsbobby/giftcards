package com.nitin.giftcard.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.nitin.dto.GiftCardDTO;

/**
 * Created by tempnisha on 2017-03-08.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.nitin"})
@Service
public class GiftCardServiceImpl implements GiftCardService {

    private static Logger logger = Logger.getLogger(GiftCardServiceImpl.class.getName());

    @Autowired
    public GiftCardDTO giftCardDTO;

    @Override
    public GiftCardDTO getGiftCardDetails(String id) {
        logger.info("Inside getGiftCardService() method " +id);
        giftCardDTO.setId(id);
        giftCardDTO.setCardNumber("MJK0001");
        giftCardDTO.setRemainingAfterPurchase("2000");
        giftCardDTO.setTotalBalance("12000");
        return giftCardDTO;
    }

    @Override
    public GiftCardDTO addGiftCard(String id) {
        return null;
    }
}