package com.icangjinge.bank.springboot.base.integrate.session.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    String uid(HttpSession session) {
        return session.getId();
    }

}
