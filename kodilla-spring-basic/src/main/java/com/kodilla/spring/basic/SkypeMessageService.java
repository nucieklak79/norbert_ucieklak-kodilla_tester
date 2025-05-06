package com.kodilla.spring.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SkypeMessageService implements MessageService {

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype";
    }
}
