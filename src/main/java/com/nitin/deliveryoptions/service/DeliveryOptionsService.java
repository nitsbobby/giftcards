package com.nitin.deliveryoptions.service;

import org.springframework.http.HttpHeaders;

import java.util.List;

/**
 * Created by tempnisha on 2017-03-08.
 */
public interface DeliveryOptionsService {
    public String getDeliveryOptionGreetingService();
    public int getDeliveryOptionIdService(int id);
    public HttpHeaders createHttpHeaders();
    public int getDeliveryOptionService(String game, Long gameId, String dateOrNull);
    public List<String> getAllDeliveryOptionNameService();
    public List<String> getAllDeliveryOptionByRestClientService();
}
