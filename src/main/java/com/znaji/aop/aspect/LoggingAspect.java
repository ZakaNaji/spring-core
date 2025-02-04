package com.znaji.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class LoggingAspect {
    @Before("com.znaji.aop.aspect.HelloServiceAspect.helloServicePointCut()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("log this before exe of methode: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "com.znaji.aop.aspect.HelloServiceAspect.helloServicePointCut()",
                    returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Methode : " + joinPoint.getSignature().getName() + ", returned : " + result);
    }
}
