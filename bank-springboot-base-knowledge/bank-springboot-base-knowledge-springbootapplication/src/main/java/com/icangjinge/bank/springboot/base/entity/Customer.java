package com.icangjinge.bank.springboot.base.entity;

public class Customer {
    private String name = "springboot";
    private int age = 18;
    private String custormerId = "";

    public Customer(String name, int age, String custormerId) {
        this.name = name;
        this.age = age;
        this.custormerId = custormerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustormerId() {
        return custormerId;
    }

    public void setCustormerId(String custormerId) {
        this.custormerId = custormerId;
    }
}
