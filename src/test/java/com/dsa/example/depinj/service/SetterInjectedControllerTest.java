package com.dsa.example.depinj.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new PropertyGreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		System.out.println(setterInjectedController.getGreeting());
	}

}
