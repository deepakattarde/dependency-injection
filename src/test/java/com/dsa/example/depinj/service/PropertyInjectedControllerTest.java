package com.dsa.example.depinj.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		propertyInjectedController = new PropertyInjectedController();
		
		propertyInjectedController.greetingService = new PropertyGreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(propertyInjectedController.getGreeting());
	}

}
