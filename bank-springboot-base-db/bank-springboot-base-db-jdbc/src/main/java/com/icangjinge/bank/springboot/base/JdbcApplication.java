package com.icangjinge.bank.springboot.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(JdbcApplication.class, args);
    }
}
