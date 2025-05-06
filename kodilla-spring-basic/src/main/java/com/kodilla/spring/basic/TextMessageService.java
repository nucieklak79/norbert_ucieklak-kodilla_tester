package com.kodilla.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class TextMessageService implements MessageService {
    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using RCS";
    }
}
