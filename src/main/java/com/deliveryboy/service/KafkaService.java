package com.deliveryboy.service;

import com.deliveryboy.kafka.config.AppConstances;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public String updateLocation(String location){
        System.out.println("Producer: "+location);
        kafkaTemplate.send(AppConstances.LOCATION_TOPIC_NAME,location);
        return location;
    }
}
