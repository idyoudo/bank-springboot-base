package com.icangjinge.bank.springboot.base.controller;


import com.alibaba.fastjson.JSONObject;
import com.icangjinge.bank.springboot.base.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {
    @Resource
    private CustomerService customerService = null;
    @RequestMapping("/queryCustomer")
    public String queryCustomer(@RequestParam  String customerId) {
        return JSONObject.toJSONString( customerService.queryCustomer(customerId)) ;
    }
}
