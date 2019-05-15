package com.icangjinge.bank.springboot.base.integrate.redis.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class RedisController  {
//    private Log logger = LogFactory.getLog(this.getClass()) ;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/getStr")
    public String getStr() throws Exception {
        redisTemplate.opsForValue().set("key","value",100,TimeUnit.SECONDS);
        return  (String)redisTemplate.opsForValue().get("1111111");
    }
}
