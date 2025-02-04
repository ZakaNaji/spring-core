package com.znaji.aop.introduction;

public class MaxCalculatorImpl implements MaxCalculator{
    @Override
    public int max(int a, int b) {
        return Math.max(a, b);
    }
}
