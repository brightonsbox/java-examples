package com.brightonsbox.springcloudstreamexample.model;

import lombok.Getter;
import lombok.ToString;

@Getter // Getter methods required by SCS for converting message
@ToString
public class Message {

    private long timestamp;
    private String message;

    private Message() {
    }

    public Message(final long timestamp, final String message) {
        this.timestamp = timestamp;
        this.message = message;
    }
}
