package com.znaji.aop;

import com.znaji.aop.config.AopConfig;
import com.znaji.aop.introduction.Counter;
import com.znaji.aop.introduction.MaxCalculator;
import com.znaji.aop.introduction.StandardCalculator;
import com.znaji.aop.service.HelloService;
import com.znaji.context.events.Event;
import com.znaji.context.events.EventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(AopConfig.class)) {
            var eventPub = ctx.getBean(EventPublisher.class);
            eventPub.publishEvent(new Event("Hello world!"));
        }
    }
}
