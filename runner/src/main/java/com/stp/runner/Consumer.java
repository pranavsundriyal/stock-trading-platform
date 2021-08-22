package com.stp.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "stocks", groupId = "my-group")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}

