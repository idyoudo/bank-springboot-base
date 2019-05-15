package com.icangjinge.bank.springboot.base.integrate.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class RedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

}


//    一 简介
//     ValueOperations和HashOperations和都是操作对redis进行数据操作的工具类。
//
//    二 区别
//      ValueOperations是操作简单的value例如String工具类
//      HashOperations是操作value为Map的工具类