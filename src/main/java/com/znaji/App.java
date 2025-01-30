package com.znaji;

import com.znaji.beans.BannerLoader;
import com.znaji.beans.Cat;
import com.znaji.beans.Owner;
import com.znaji.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (var ctx = new AnnotationConfigApplicationContext(Config.class)) {
            System.out.println(ctx.getMessage("alert.hi",null, Locale.FRENCH));
        }
    }
}
