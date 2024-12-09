package com.deliveryboy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @GetMapping()
    private String getMessage(){
        return "Delivery-Service";
    }



}
