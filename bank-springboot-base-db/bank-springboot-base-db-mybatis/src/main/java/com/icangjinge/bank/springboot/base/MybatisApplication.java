package com.icangjinge.bank.springboot.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.icangjinge.bank.springboot.base.persistence")
public class MybatisApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
