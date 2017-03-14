package com.nitin.bankbranch.service.v1;

import com.nitin.bankbranch.service.DeliveryOptionsService;
import com.nitin.exception.GreetingNotFoundException;
import com.nitin.utils.Utils;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tempnisha on 2017-03-08.
 */
public class DeliveryOptionsServiceImpl implements DeliveryOptionsService {

    private static Logger logger = Logger.getLogger(DeliveryOptionsServiceImpl.class.getName());

    @Override
    public String getDeliveryOptionGreetingService() {
        try{
            logger.info("Inside getDeliveryOptionGreetingService() method ");
            return "Happy Greetings from DeliveryOptions Team";
            //throw new Exception();
        }catch (Exception e){
            try {
                throw new GreetingNotFoundException("v1", e.getMessage());
            } catch (GreetingNotFoundException e1) {
                e1.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int getDeliveryOptionIdService(int id) {
        logger.info("Inside getDeliveryOptionIdService() method ");
        return id;
    }

    @Override
    public HttpHeaders createHttpHeaders() {
        logger.info("Inside createHttpHeaders() method ");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("HeaderName","Nitin Sharma");
        return httpHeaders;
    }

    @Override
    public int getDeliveryOptionService(String deliveryOption, Long deliveryOptionId, String dateOrNull) {
        logger.info("Inside getDeliveryOptionService() method ");
        if(!dateOrNull.equals("") || !dateOrNull.isEmpty()) {
            Date date = Utils.convertStringIntoLocalDateFormat(dateOrNull);
            logger.info("Date received from Client is: " + date);
        }
        return deliveryOptionId.intValue();
    }

    @Override
    public List<String> getAllDeliveryOptionNameService() {
        logger.info("Inside getAllDeliveryOptionsNameService() method ");
        List<String> deliveryOptions = new ArrayList<String>();
        deliveryOptions.add("Lille");
        deliveryOptions.add("TempleRun");
        deliveryOptions.add("Battle");
        deliveryOptions.add("Social");
        deliveryOptions.add("Thunder");
        return deliveryOptions;
    }

    @Override
    public List<String> getAllDeliveryOptionByRestClientService() {
        logger.info("Inside getAllDeliveryOptionsByRestClientService() method ");
        List<String> deliveryOptions = new ArrayList<String>();
        deliveryOptions.add("Lille By Rest");
        deliveryOptions.add("TempleRun By Rest");
        deliveryOptions.add("Battle By Rest");
        deliveryOptions.add("Social By Rest");
        deliveryOptions.add("Thunder By Rest");
        return deliveryOptions;
    }
}