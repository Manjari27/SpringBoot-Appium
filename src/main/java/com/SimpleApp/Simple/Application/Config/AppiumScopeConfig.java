package com.SimpleApp.Simple.Application.Config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppiumScopeConfig {
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new AppiumScopePOstProcessor();
    }
}
