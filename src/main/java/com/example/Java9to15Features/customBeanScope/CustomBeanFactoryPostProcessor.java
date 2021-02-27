package com.example.Java9to15Features.customBeanScope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.SimpleThreadScope;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        //factory.registerScope("thread",new SimpleThreadScope());
        factory.registerScope("tenant",new TenantScope());
    }
}
