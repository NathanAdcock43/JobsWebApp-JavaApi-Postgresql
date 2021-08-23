package com.mypersonal.jobexercises.Services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics="jobtopic", groupId = "jobgroup")
    public void consumerFromTopic(String message){
        System.out.println("Consumed message "+message);
    }
}
