package com.icangjinge.bank.springboot.base.integrate.thymeleaf.entity;

import java.util.Date;

public class Account {
    private String acno;

    private String acname;

    private String idno;

    private String status;

    private Date createtime;

    private Date updatetime;

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno == null ? null : acno.trim();
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname == null ? null : acname.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}