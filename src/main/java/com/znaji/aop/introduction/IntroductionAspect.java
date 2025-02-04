package com.znaji.aop.introduction;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IntroductionAspect {
    @DeclareParents(
            value = "com.znaji.aop.introduction.StandardCalculator",
            defaultImpl = MaxCalculatorImpl.class
    )
    MaxCalculator maxCalculator;
}
