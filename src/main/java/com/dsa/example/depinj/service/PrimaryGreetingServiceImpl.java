package com.dsa.example.depinj.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

	@Override
	public String getGreeting() {
		return "Ahoy - Primary here";
	}

}
