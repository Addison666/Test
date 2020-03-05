package com.example.demo.config;

import com.example.demo.entity.User;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * @author THLiu i531384
 */
//初始化配置注解
    //<configuration id="",bean="com.c"
    //\>

@Configuration
public class InitialConfiguration {
    public HashMap<String,User> maps = new HashMap<>(3);
    @Bean
    public User initBean(){

        return new User("tom","10");
    }

    @Bean
    public Map<String,User> memDataBase(){
        maps.put("user1",new User("tom1","11"));
        maps.put("user2",new User("tom2","12"));
        maps.put("user3",new User("tom4","13"));
        return maps;
    }

}
