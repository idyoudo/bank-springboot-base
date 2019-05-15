package com.icangjinge.bank.springboot.base.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoValidationAnnotationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoValidationAnnotationApplication.class, args);
    }
}
