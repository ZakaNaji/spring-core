package com.znaji.aop;

import com.znaji.aop.config.AopConfig;
import com.znaji.aop.introduction.Counter;
import com.znaji.aop.introduction.MaxCalculator;
import com.znaji.aop.introduction.StandardCalculator;
import com.znaji.aop.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(AopConfig.class)) {
            var standardCalculator = ctx.getBean(StandardCalculator.class);
            System.out.println(standardCalculator.add(100, 20));
            var counter = (Counter) standardCalculator;
            System.out.println(counter.getCounter());
        }
    }
}
