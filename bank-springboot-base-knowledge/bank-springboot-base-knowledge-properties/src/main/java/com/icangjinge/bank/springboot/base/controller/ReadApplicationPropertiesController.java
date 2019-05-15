package com.icangjinge.bank.springboot.base.controller;

import com.alibaba.fastjson.JSONObject;
import com.icangjinge.bank.springboot.base.entity.ConfigProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
public class ReadApplicationPropertiesController {
    @Resource
    ConfigProperty configProperty = null;
    @RequestMapping(name="/readProperties", method= RequestMethod.POST)
    public String readProperties() throws IOException {
        String properties =  configProperty.toString();
        System.out.println(properties);

        return properties;
    }
}
// http://localhost:8081/readProperties