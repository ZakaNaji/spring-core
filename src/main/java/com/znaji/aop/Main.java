package com.znaji.aop;

import com.znaji.aop.config.AopConfig;
import com.znaji.aop.introduction.MaxCalculator;
import com.znaji.aop.introduction.StandardCalculator;
import com.znaji.aop.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(AopConfig.class)) {
            var standardCalculator = (MaxCalculator) ctx.getBean(StandardCalculator.class);
            System.out.println(standardCalculator.max(100, 20));
        }
    }
}
