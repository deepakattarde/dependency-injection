package com.dsa.example.depinj.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreeting() {
		return "Greeting there..."+SetterInjectedController.class;
	}

}
