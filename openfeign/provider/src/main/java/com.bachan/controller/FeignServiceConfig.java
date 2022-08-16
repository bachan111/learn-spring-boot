package com.bachan.controller;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@Configuration
public class FeignServiceConfig {
    /**
     * logger.Level的具体级别如下：
     * NONE：不记录任何xinxi
     * BASIC：金鸡路请求方法、url以及响应状态码和执行时间
     * HEADRES：记录处理basic级别信息之外，还会记录请求和响应的头信息
     * FULL：记录所有请求和相应信息，包括头信息、请求体、元数据
     * @return
     */
//    @Bean
//    Logger.Level feignLoggerLevel(){
//        return logger.Level.FULL;
//    }
}
