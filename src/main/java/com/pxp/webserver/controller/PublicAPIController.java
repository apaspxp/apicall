package com.pxp.webserver.controller;

import com.pxp.webserver.model.ResponsePOJO;
import com.pxp.webserver.services.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicAPIController {

    @Autowired
    APIService apiService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }

    @RequestMapping(value = "callapi", method = RequestMethod.GET)
    public List<ResponsePOJO> callAPI(){
        return apiService.callPublicAPI();
    }
}
