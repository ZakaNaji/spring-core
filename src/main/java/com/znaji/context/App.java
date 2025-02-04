package com.znaji.context;

import com.znaji.context.beans.Owner;
import com.znaji.context.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (var ctx = new AnnotationConfigApplicationContext()) {
            ctx.getEnvironment().setActiveProfiles("outside");
            ctx.register(Config.class);
            ctx.refresh();
            Owner ow = ctx.getBean(Owner.class);
            System.out.println(ow);
        }
    }
}
