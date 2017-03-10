package com.nitin.deliveryoptions;

import com.nitin.exception.DeliveryOptionsException;
import com.nitin.exception.GreetingNotFoundException;
import com.nitin.deliveryoptions.service.DeliveryOptionsService;
import com.nitin.deliveryoptions.service.v1.DeliveryOptionsServiceImpl;
import com.nitin.giftcard.service.GiftCardService;
import com.nitin.giftcard.service.GiftCardServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tempnisha on 2017-03-08.
 */

@RestController
public class DeliveryOptionsController {

    private static Logger logger = Logger.getLogger(DeliveryOptionsController.class.getName());
    DeliveryOptionsService deliveryOptionsService = new DeliveryOptionsServiceImpl();
    GiftCardService giftCardService = new GiftCardServiceImpl();

    @RequestMapping("/greetings")
    public String getGreetings() throws GreetingNotFoundException {
        return deliveryOptionsService.getDeliveryOptionGreetingService();
    }

    @RequestMapping("/deliveryOption/{id}")
    public int getDeliveryOptionId(@PathVariable int id) throws DeliveryOptionsException {
        return deliveryOptionsService.getDeliveryOptionIdService(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/deliveryOptions")
    public HttpHeaders createAndReturnHttpHeaders() throws DeliveryOptionsException {
        return deliveryOptionsService.createHttpHeaders();
    }

    @RequestMapping(method = RequestMethod.GET, value="/{deliveryOption}/{deliveryOptionId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getDeliveryOption(@PathVariable String deliveryOption, @PathVariable Long deliveryOptionId, @RequestParam(value = "date", required = false) String dateOrNull) throws DeliveryOptionsException {
        return deliveryOptionsService.getDeliveryOptionService(deliveryOption, deliveryOptionId,dateOrNull);
    }

    @RequestMapping(method = RequestMethod.GET, value="/getAllDeliveryOptions", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllDeliveryOptions() throws DeliveryOptionsException {
        return deliveryOptionsService.getAllDeliveryOptionNameService();
    }

    @RequestMapping(method = RequestMethod.GET, value="/getAllDeliveryOptionsByRest", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllDeliveryOptionsByRest() throws DeliveryOptionsException {
        return deliveryOptionsService.getAllDeliveryOptionByRestClientService();
    }
}