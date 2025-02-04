package com.znaji.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Around("execution(* com.znaji.aop.service.HelloService.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before " + joinPoint.getSignature().getName());
        Object message = joinPoint.proceed();
        System.out.println("after " + joinPoint.getSignature().getName());
        return message;
    }
}
