package com.brightonsbox.springcloudstreamexample.service;

import com.brightonsbox.springcloudstreamexample.MessageStreams;
import com.brightonsbox.springcloudstreamexample.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class MessageService {

    private final MessageStreams messageStreams;

    public MessageService(final MessageStreams messageStreams) {
        this.messageStreams = messageStreams;
    }

    public void sendGreeting(final Message message) {

        log.info("Sending message {}", message);

        MessageChannel messageChannel = messageStreams.outboundMessages();

        messageChannel.send(MessageBuilder
                .withPayload(message)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
