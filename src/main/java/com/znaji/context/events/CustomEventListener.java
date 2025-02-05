package com.znaji.context.events;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements BeanNameAware {

    private String beanName;
    @EventListener
    public void eventListener(Event event) {
        System.out.println(String.format("bean with name %s intercepted an event: ", beanName));
        System.out.println(event.getMessage());
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
