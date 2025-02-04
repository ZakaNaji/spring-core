package com.znaji.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class LoggingAspect {
    @Before("execution(* com.znaji.aop.service.HelloService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("log this before exe of methode: " + joinPoint.getSignature().getName());
    }
}
