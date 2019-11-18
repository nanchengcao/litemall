package com.nanchengcao.smart.eureka.biz.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置常量
 */
@Component
public class CommonConstans {
    /**
     * 传输格式
     */
     public static final String APPLICATION_JSON= "application/json";
     public static final String APPLICATION_JSON_UTF8= "application/json;charset=UTF-8";
     public static final String API_TOKEN= "token";



    public static String serviceAuthor;

    @Value("${service.author}")
    public void setServiceAuthor(String author) {
        serviceAuthor = author;
    }
}