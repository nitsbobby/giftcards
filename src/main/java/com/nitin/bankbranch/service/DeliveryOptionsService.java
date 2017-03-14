package com.nitin.bankbranch.service;

import java.util.List;

import org.springframework.http.HttpHeaders;

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
