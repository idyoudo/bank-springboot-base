package com.icangjinge.bank.springboot.base.entity;

public class Account {
    private String acno ;
    private String acName;
    private String idno;

    public Account(String acno, String acName, String idno) {
        this.acno = acno;
        this.acName = acName;
        this.idno = idno;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }
}
