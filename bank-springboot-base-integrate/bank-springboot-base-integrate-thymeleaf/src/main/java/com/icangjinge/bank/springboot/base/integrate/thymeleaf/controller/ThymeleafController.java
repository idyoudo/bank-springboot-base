package com.icangjinge.bank.springboot.base.integrate.thymeleaf.controller;

import com.icangjinge.bank.springboot.base.integrate.thymeleaf.entity.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ThymeleafController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/list1")
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

    /**
     * 此方式需@Controller注解
     * @param model
     * @return
     */
    @RequestMapping("/list2")
    public String  listUser(Model model) {
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
        model.addAttribute("AccountList",accountList);
        return "AccountInfo";
    }

}
