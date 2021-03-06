package com.dsa.example.depinj.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		constructorInjectedController = new ConstructorInjectedController(new PropertyGreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		System.out.println(constructorInjectedController.getGreeting());
	}

}
