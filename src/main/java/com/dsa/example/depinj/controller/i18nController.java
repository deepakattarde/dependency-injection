package com.dsa.example.depinj.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.dsa.example.depinj.service.GreetingService;

@Controller
public class i18nController {

	private final GreetingService greetingService;

	public i18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.getGreeting();
	}
}
