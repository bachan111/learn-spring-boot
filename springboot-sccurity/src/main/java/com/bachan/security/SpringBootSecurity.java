package com.bachan.security;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.bachan.security.mapper")
public class SpringBootSecurity {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurity.class);
    }
}
