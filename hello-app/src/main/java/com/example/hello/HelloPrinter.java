package com.example.hello;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloPrinter {

    @Scheduled(fixedDelay = 10000)
    public void printHello() {
        System.out.println("Hello");
    }
}
