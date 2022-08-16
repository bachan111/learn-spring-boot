package com.bachan.config;

import com.bachan.config.bean.Student1;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties({Student1.class})
public class Config {
    @Bean
    public Student1 student(){
        return new Student1();
    }
}
