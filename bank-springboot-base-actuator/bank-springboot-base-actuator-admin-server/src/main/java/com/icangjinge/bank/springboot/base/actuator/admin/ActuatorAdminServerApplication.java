package com.icangjinge.bank.springboot.base.actuator.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ActuatorAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorAdminServerApplication.class, args);
    }

}
