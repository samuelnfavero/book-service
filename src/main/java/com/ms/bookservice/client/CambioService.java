package com.ms.bookservice.client;

import com.ms.bookservice.dto.request.CambioRequest;
import com.ms.bookservice.dto.response.CambioResponse;
import com.ms.bookservice.enums.CurrencyEnum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CambioService {

    private static final String URL = "http://localhost:8000/cambio-service";

    private final RestTemplate restTemplate;

    public CambioService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CambioResponse getCambio(CambioRequest cambioRequest){
        String url = URL;
        url += "/" + cambioRequest.getAmount();
        url += "/" + cambioRequest.getFrom();
        url += "/" + cambioRequest.getTo();
        return restTemplate.getForEntity(url, CambioResponse.class).getBody();
    }

//    public CambioResponse getCambio(CambioRequest cambioRequest){
//        HttpEntity<?> httpEntity = new HttpEntity<>(cambioRequest);
//
//        return restTemplate.exchange(URL,
//                HttpMethod.GET,
//                httpEntity,
//                CambioResponse.class).getBody();
//    }
}
