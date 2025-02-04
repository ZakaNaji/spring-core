package com.znaji.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.znaji.aop.service", "com.znaji.aop.aspect"})
@EnableAspectJAutoProxy
public class AopConfig {
}
