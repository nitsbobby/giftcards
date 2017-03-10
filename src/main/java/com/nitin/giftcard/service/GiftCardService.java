package com.nitin.giftcard.service;

import com.nitin.dto.GiftCardDTO;
import org.springframework.stereotype.Component;

/**
 * Created by tempnisha on 2017-03-09.
 */

public interface GiftCardService {

    public GiftCardDTO getGiftCardDetails(String id);
    public GiftCardDTO addGiftCard(String id);

}
