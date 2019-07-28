package com.brightonsbox.springcloudstreamexample;

import com.brightonsbox.springcloudstreamexample.model.Message;
import com.brightonsbox.springcloudstreamexample.service.MessageService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {

        messageService.sendGreeting(new Message(System.currentTimeMillis(), message));
    }
}
