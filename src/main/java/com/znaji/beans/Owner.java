package com.znaji.beans;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @Autowired
    private Cat cat;


    public Cat getCat() {
        return cat;
    }


    //@Override
    //public String toString() {
    //    return "Owner{" +
    //            "cat=" + cat +
    //            '}';
    //}
}
