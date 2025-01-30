package com.znaji.config;

import com.znaji.beans.BannerLoader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan(basePackages = "com.znaji.beans")
@PropertySource("classpath:test.properties")
public class Config {

    //@Bean(name = "tom")
    //public Cat tom() {
    //    Cat tom = new Cat();
    //    tom.setName("TOM");
    //    return tom;
    //}
//
    //@Bean
    //public Cat leo() {
    //    Cat leo = new Cat();
    //    leo.setName("Leo");
    //    return leo;
    //}

    @Value("classpath:banner.txt")
    private Resource banner;

    @Bean(initMethod = "init")
    public BannerLoader bannerLoader() {
        return new BannerLoader(banner);
    }

    @Bean
    public MessageSource messageSource() {
        var messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("alerts");
        return messageSource;
    }

}
