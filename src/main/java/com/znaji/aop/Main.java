package com.znaji.aop;

import com.znaji.aop.config.AopConfig;
import com.znaji.aop.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(AopConfig.class)) {
            var helloService = ctx.getBean(HelloService.class);
            helloService.printHello("Zakaria");
        }
    }
}
