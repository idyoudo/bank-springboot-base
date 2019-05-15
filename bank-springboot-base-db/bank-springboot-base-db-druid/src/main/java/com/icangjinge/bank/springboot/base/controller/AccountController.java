package com.icangjinge.bank.springboot.base.controller;

import com.icangjinge.bank.springboot.base.entity.Account;
import com.icangjinge.bank.springboot.base.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class AccountController {
    @Autowired
    public AccountRepository accountRepository = null;

    @RequestMapping(value="/insertAccount.do",method= {RequestMethod.POST,RequestMethod.GET})
    public int insert(@RequestParam String acno, @RequestParam String acname, @RequestParam String idno) {
       return  accountRepository.insert(new Account(acno,acname,idno));
    }

    @RequestMapping(value="/queryAccount.do",method= {RequestMethod.POST,RequestMethod.GET})
    public Account queryAccount(@RequestParam String acno) {
        return  accountRepository.queryAccountByAcNo(acno) ;
    }


}
