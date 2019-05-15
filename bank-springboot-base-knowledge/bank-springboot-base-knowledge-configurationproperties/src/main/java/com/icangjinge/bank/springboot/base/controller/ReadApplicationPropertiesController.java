package com.icangjinge.bank.springboot.base.controller;

import com.icangjinge.bank.springboot.base.entity.ConfigProperties;
import com.icangjinge.bank.springboot.base.entity.ConfigProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Map;

@RestController
public class ReadApplicationPropertiesController {
    @Resource
    ConfigProperty configProperty = null;

    @Autowired
    private ConfigProperties configProperties;

    @RequestMapping(name="/readProperties", method= RequestMethod.POST)
    public String readProperties() throws IOException {
        String properties =  configProperty.toString();
        System.out.println(properties);

        return properties;
    }


    @RequestMapping("/readMuiltProperties")
    public String hello(){

        StringBuffer sb=new StringBuffer();
        sb.append("==============简单属性访问================<br/>");
        //简单属性的访问
        sb.append(configProperties.getFrom()+"<br/>");
        sb.append(configProperties.getHost()+"<br/>");
        sb.append(configProperties.getPort()+"<br/>");

        sb.append("==============List[String]访问================"+"<br/>");
        sb.append(configProperties.getRecipients()+"<br/><br/>");
        sb.append("==============Map[String,String]访问================"+"<br/>");
        sb.append(configProperties.getAdditionalHeaders()+"<br/><br/>");

        sb.append("==============Object访问================"+"<br/>");

        sb.append(configProperties.getCredentials()+"<br/><br/>");

        sb.append("==============List[Object]访问================<br/>");
        for(ConfigProperties.Credentials cs:configProperties.getCs()){
            sb.append(cs+"<br/>");
        }
        sb.append("<br/>==============Map[String,Object]访问================"+"<br/>");
        for(Map.Entry<String,ConfigProperties.Credentials> me:configProperties.getMp().entrySet()){
            sb.append(me.getKey()+"    "+me.getValue()+"<br/>");
        }
        sb.append("（注意不支持Set属性） ");
        return sb.toString();
    }
}
