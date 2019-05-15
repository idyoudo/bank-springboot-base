package com.icangjinge.bank.springboot.base.validator.controller;

import com.icangjinge.bank.springboot.base.validator.entity.Account;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryBalanceController {

    /**
     * 查询账户余额，同时将余额发到手机号码上（注意：实际生产以业务为准）
     * @return
     */
//    @RequestMapping(name="/queryBalance", method= RequestMethod.POST)
//    public String queryBalance(@Validated @RequestBody Account account) {
//
//        return "10.00";
//    }


    /**
     * 查询账户余额，同时将余额发到手机号码上（注意：实际生产以业务为准）
     * @return
     */
    @RequestMapping(name="/queryBalance2", method= RequestMethod.POST)
    public String queryBalance2(@Validated @RequestBody Account account,BindingResult bindingResult ) {

        if(bindingResult.hasErrors()){
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                return fieldError.getField() + ":" + fieldError.getDefaultMessage();
            }
        }

        return "10.00";
    }
}
