package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class ClockTestSuite {
    @Test
    void shouldHaveDifferentTimesForDifferentBeans() throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Clock clock1 = context.getBean(Clock.class);
        Thread.sleep(5500); //a delay between 1st adn 2nd bean by exactly 5.5 seconds
        Clock clock2 = context.getBean(Clock.class);

        System.out.println("Clock1 time: " + clock1.getTime());
        System.out.println("Clock2 time: " + clock2.getTime());

        assertNotEquals(clock1.getTime(), clock2.getTime());
    }
}
