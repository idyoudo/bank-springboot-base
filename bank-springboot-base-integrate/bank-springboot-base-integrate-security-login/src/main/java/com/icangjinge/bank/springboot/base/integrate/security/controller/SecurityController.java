package com.icangjinge.bank.springboot.base.integrate.security.controller;

import com.icangjinge.bank.springboot.base.integrate.security.entity.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class SecurityController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login() {
        return "login";
    }


    @RequestMapping("/list")
    ModelAndView  getAccount(ModelAndView modelAndView) {
        List accountList = new ArrayList();
        for(int i = 0;i < 5;i++){
            Account account = new Account();
            account.setAcname("藏金阁"+i);
            account.setAcno("9559980058054"+i+"35212");
            account.setCreatetime(new Date());
            account.setStatus("00");
            account.setIdno("42112319000221165"+i);
            account.setUpdatetime(new Date());
            accountList.add(account);
        }
        modelAndView.setViewName("AccountInfo");
        modelAndView.addObject("AccountList",accountList);
        return modelAndView;
    }

    @RequestMapping("/")
    ModelAndView  getAccount2(ModelAndView modelAndView) {
        return getAccount(modelAndView);
    }

}
