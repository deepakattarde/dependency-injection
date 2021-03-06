package com.dsa.example.depinj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HIN","default"})
@Service("i18nService")
public class i18nHindiGreetingService implements GreetingService {

	@Override
	public String getGreeting() {
		return "Namaste";
	}

}
