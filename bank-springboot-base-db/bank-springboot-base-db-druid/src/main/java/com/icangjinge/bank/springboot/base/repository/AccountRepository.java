package com.icangjinge.bank.springboot.base.repository;

import com.icangjinge.bank.springboot.base.entity.Account;

public interface AccountRepository {

    public int insert(Account account) ;

    public Account queryAccountByAcNo(String acno) ;
}
