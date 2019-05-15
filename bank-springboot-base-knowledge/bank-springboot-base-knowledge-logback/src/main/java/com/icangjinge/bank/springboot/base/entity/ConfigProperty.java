package com.icangjinge.bank.springboot.base.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "com.icangjingge")
@Component
public class ConfigProperty {
    private String name = null;
    private String address = null;
    private Object bignumber = null;
    private Object refname = null;
    private Object uuid = null;
    private Object secret = null;
    private Object number = null;
    private Object number_less_than_ten = null;
    private Object number_in_range = null;


    public void setAddress(String address) {
        this.address = address;
    }

    public void setBignumber(Object bignumber) {
        this.bignumber = bignumber;
    }

    public void setRefname(Object refname) {
        this.refname = refname;
    }

    public void setUuid(Object uuid) {
        this.uuid = uuid;
    }

    public void setSecret(Object secret) {
        this.secret = secret;
    }

    public void setNumber(Object number) {
        this.number = number;
    }

    public void setNumber_less_than_ten(Object number_less_than_ten) {
        this.number_less_than_ten = number_less_than_ten;
    }

    public void setNumber_in_range(Object number_in_range) {
        this.number_in_range = number_in_range;
    }

    public String getAddress() {
        return address;
    }

    public Object getBignumber() {
        return bignumber;
    }

    public Object getRefname() {
        return refname;
    }

    public Object getUuid() {
        return uuid;
    }

    public Object getSecret() {
        return secret;
    }

    public Object getNumber() {
        return number;
    }

    public Object getNumber_less_than_ten() {
        return number_less_than_ten;
    }

    public Object getNumber_in_range() {
        return number_in_range;
    }

    @Override
    public String toString() {
        return com.alibaba.fastjson.JSONObject.toJSONString(this);
    }
}
