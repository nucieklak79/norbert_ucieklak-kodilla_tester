package com.kodilla.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class FacebookMessageService implements MessageService {

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Facebook";
    }
}
