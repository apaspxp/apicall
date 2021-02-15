package com.pxp.webserver.services;

import com.pxp.webserver.model.FinalResponse;
import com.pxp.webserver.model.ResponsePOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class APIService {
    @Autowired
    RestTemplate restTemplate;

    public List<ResponsePOJO> callPublicAPI(){

        java.net.URI uri = null;
        try {
            uri = new URI("https://gorest.co.in/public-api/posts");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<FinalResponse> requestEntity = new HttpEntity<>(null, headers);
        try {
            ResponseEntity<FinalResponse> response = restTemplate.exchange(uri, HttpMethod.GET, requestEntity, FinalResponse.class);
            return response.getBody().getData();
        }catch (Exception e){
            throw e;
        }
    }
}
