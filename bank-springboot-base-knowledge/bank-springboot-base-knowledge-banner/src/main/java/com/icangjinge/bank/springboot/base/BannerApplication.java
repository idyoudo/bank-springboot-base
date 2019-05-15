package com.icangjinge.bank.springboot.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BannerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(BannerApplication.class, args);
    }
}