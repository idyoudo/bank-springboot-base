package com.icangjinge.bank.springboot.base.controller;

import com.icangjinge.bank.springboot.base.entity.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @RequestMapping(name="/queryAccount", method= RequestMethod.POST)
    public Account queryAccount() {
        return new Account("95599800580845","Spring Boot","4211231988706121590");
    }

}
