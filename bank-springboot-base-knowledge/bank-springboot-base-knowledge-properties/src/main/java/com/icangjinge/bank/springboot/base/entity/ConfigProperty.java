package com.icangjinge.bank.springboot.base.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigProperty {
    @Value("${com.icangjingge.name}")
    private String name = null;

    @Value("${com.icangjingge.address}")
    private String address = null;

    @Value("${com.icangjingge.bignumber}")
    private Object bignumber = null;

    @Value("${com.icangjingge.refname}")
    private Object refname = null;

    @Value("${com.icangjingge.uuid}")
    private Object uuid = null;

    @Value("${com.icangjingge.secret}")
    private Object secret = null;

    @Value("${com.icangjingge.number}")
    private Object number = null;

    @Value("${com.icangjingge.number_less_than_ten}")
    private Object number_less_than_ten = null;

    @Value("${com.icangjingge.number_in_range}")
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
