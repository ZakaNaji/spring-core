package com.znaji.aop.introduction;

import org.springframework.stereotype.Component;

@Component
public class StandardCalculator {

    public int add(int a, int b) {
        return a + b;
    }
}
