package com.znaji.aop.aspect;

import com.znaji.aop.introduction.Counter;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalculatorAspect {

    @After("execution(* com.znaji.aop.introduction.*.*(..)) && this(counter)")
    public void afterCalculatorMethod(Counter counter) {
        counter.increase();
    }
}
