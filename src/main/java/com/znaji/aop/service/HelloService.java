package com.znaji.aop.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String printHello(String name) {
        System.out.println(
                "Hello " + name
        );
        return "Hello " + name;
    }

    public String printGoodBye(String name) {
        var message = "Goodbye Mr. " + name;
        System.out.println(message);
        return message;
    }
}
