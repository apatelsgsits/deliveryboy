package com.deliveryboy.controller;

import com.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService service;

    @PostMapping("/update")
    private ResponseEntity<?> updateLocation(){
        String location =service.updateLocation("("+Math.random()*100+","+Math.random()*100+")");
        return new ResponseEntity<>(Map.of("location",location),HttpStatus.OK);
    }



}
