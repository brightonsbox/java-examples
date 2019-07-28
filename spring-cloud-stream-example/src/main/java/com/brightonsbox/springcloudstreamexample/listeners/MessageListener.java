package com.brightonsbox.springcloudstreamexample.listeners;

import com.brightonsbox.springcloudstreamexample.MessageStreams;
import com.brightonsbox.springcloudstreamexample.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageListener {

    @StreamListener(MessageStreams.INPUT)
    public void handleGreetings(@Payload Message message) {
        log.info("Received message: {}", message);
    }
}
