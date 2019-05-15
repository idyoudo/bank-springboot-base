package com.icangjinge.bank.springboot.base.persistence;

import com.icangjinge.bank.springboot.base.entity.Account;
import com.icangjinge.bank.springboot.base.model.AccountModel;

import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(String acno);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String acno);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    int deleteAll();

    List<Account> selectAccountListByCondition(AccountModel accountModel);

}