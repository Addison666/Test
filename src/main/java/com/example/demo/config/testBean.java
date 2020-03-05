package com.example.demo.config;

import com.example.demo.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author THLiu i531384
 */
@Component
public class testBean implements BeanPostProcessor {

    @Override
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       if(bean instanceof User) {
           System.out.println("我是user前置处理");
       }
        return bean;
    }

    @Override
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof User) {
            System.out.println("我是user后置处理");
        }
        return bean;
    }
}
