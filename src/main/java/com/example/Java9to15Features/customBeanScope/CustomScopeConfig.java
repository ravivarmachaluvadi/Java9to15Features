package com.example.Java9to15Features.customBeanScope;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomScopeConfig {

    @Bean
    public  static BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return  new CustomBeanFactoryPostProcessor();
    }
}
