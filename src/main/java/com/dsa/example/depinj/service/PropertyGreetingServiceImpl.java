package com.dsa.example.depinj.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreeting() {
		return "Greeting there..."+PropertyInjectedController.class;
	}

}
