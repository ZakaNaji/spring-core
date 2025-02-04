package com.znaji.aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* com.znaji.aop.service.HelloService.printHello(..))")
    public void beforePrintHello() {
        System.out.println("Before");
    }

    @After("execution(* com.znaji.aop.service.HelloService.printHello(..))")
    public void after() {
        System.out.println("After (will always exe, regardless if returned or exception)");
    }

    @AfterReturning("execution(* com.znaji.aop.service.HelloService.printHello(..))")
    public void afterReturning() {
        System.out.println("After Returning");
    }

    @AfterThrowing("execution(* com.znaji.aop.service.HelloService.printHello(..))")
    public void afterThrowing() {
        System.out.println("After Throwing an exception");
    }
}
