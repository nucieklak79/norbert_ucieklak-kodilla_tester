package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype") // Every new bean should return different time
public class Clock {
    private LocalTime time;

    public Clock() {
        this.time = LocalTime.now();
        System.out.println("This bean was created at: " + time);
        }
        public LocalTime getTime() {
        return time;
        }
}
