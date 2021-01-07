package com.hq.config;

import com.hq.pojo.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration  代表这是一个配置类 和beans.xml 等价
@Configuration //也会被注册到spring容器中 因为他本身也是一个组件
@ComponentScan("com.hq.pojo")
public class Config {

        @Bean
        public User  MyUser(){
            return  new User();
        }
}
