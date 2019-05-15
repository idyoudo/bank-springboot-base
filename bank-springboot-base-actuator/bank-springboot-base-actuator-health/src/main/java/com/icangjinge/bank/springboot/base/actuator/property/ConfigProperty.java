package com.icangjinge.bank.springboot.base.actuator.property;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "springboot.property")
@Component
public class ConfigProperty {

    private String name;

    public String getAddress() {
        return address;
    }

    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this) ;
    }
}
