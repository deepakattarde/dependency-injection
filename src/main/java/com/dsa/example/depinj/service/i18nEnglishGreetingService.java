package com.dsa.example.depinj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreetingService implements GreetingService {

	@Override
	public String getGreeting() {
		return "Hello World";
	}

}
