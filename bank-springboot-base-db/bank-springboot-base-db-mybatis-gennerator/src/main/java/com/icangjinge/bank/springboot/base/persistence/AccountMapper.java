package com.icangjinge.bank.springboot.base.persistence;

import com.icangjinge.bank.springboot.base.entity.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(String acno);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String acno);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}