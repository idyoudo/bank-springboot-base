package com.icangjinge.bank.springboot.base.validator.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class QueryBalanceController {

    /**
     * 查询账户余额，同时将余额发到手机号码上（注意：实际生产以业务为准）
     * @param acno
     * @param idno
     * @return
     */
    @RequestMapping(name="/queryBalance", method= RequestMethod.POST)
    public String queryBalance(@RequestParam("acno") String acno,@RequestParam("idno") String idno,@RequestParam("phoneNo") String phoneNo) {

        if(StringUtils.isEmpty(acno)){
            return "账户不能为空";
        }
        if(acno.length()!=19){
            return "账户长度必须为19位";
        }

        if(StringUtils.isEmpty(idno)){
            return "身份证不能为空";
        }
        if(idno.length()!=18){
            return "身份证长度必须为18位";
        }

        if(StringUtils.isEmpty(phoneNo)){
            return "手机号码不能为空";
        }
        if(phoneNo.length()!=11){
            return "手机号码长度必须是11位";
        }

        return "10.00";
    }
}
