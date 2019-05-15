package com.icangjinge.bank.springboot.base.actuator.controller;

import com.icangjinge.bank.springboot.base.actuator.property.ConfigProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloActuatorController {

	@Resource
	public ConfigProperty configProperty = null;

	@RequestMapping("/helloactuator")
	public String helloactuator(){
		return configProperty.toString();
	}
}
