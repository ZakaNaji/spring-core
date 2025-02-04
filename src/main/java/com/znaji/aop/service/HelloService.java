package com.znaji.aop.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void printHello(String name) {
        System.out.println(
                "Hello " + name
        );
        throw new RuntimeException("Ooops!!");
    }
}
