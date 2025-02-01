package com.znaji.config;

import com.znaji.beans.BannerLoader;
import com.znaji.beans.Cat;
import com.znaji.beans.Owner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan(basePackages = "com.znaji.beans")
@PropertySource("classpath:test.properties")
public class Config {

    @Bean
    @Profile("inside")
    public Cat tom() {
        Cat tom = new Cat();
        tom.setName("TOM");
        return tom;
    }

    @Bean
    @Profile("outside")
    public Cat leo() {
        Cat leo = new Cat();
        leo.setName("Leo");
        return leo;
    }

    @Bean
    public Owner owner(Cat cat) {
        Owner owner = new Owner();
        owner.setCat(cat);
        return owner;
    }

    //@Value("classpath:banner.txt")
    //private Resource banner;
//
    //@Bean(initMethod = "init")
    //public BannerLoader bannerLoader() {
    //    return new BannerLoader(banner);
    //}
//
    //@Bean
    //public MessageSource messageSource() {
    //    var messageSource = new ResourceBundleMessageSource();
    //    messageSource.setBasename("alerts");
    //    return messageSource;
    //}

}
