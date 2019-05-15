package com.icangjinge.bank.springboot.base.repository;

import com.icangjinge.bank.springboot.base.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Account account) {
        return jdbcTemplate.update("INSERT INTO Account(acno, acName, idno) values(?, ?, ?)",
                account.getAcno(),account.getAcName(),account.getIdno());
    }

    @Override
    public Account queryAccountByAcNo(String acno) {
        return jdbcTemplate.queryForObject("SELECT * FROM Account WHERE acno=?", new Object[] { acno }, new BeanPropertyRowMapper<Account>(Account.class));
    }
}
