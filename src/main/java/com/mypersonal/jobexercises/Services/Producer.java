package com.mypersonal.jobexercises.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    public static final String topic = "jobtopic";

    @Autowired
    private KafkaTemplate<String, String> KafkaTemp;

    public void publishToTopic(String message) {
        System.out.println("Publishing to topicId "+topic);
        this.KafkaTemp.send(topic, message);
    }
}
