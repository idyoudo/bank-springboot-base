package com.icangjinge.bank.springboot.base.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorClientApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ActuatorClientApplication.class, args);
    }
}
