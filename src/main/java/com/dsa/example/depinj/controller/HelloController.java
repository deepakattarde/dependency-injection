package com.dsa.example.depinj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dsa.example.depinj.service.GreetingService;

@Controller
public class HelloController {

	@Autowired
	GreetingService greetingService;
	
	public String sayHello() {
		System.out.println("Hey wassup..");
		
		System.out.println(greetingService.getGreeting());
		return "Hello";
	}
}
