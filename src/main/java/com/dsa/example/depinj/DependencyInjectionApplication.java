package com.dsa.example.depinj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dsa.example.depinj.controller.HelloController;
import com.dsa.example.depinj.controller.i18nController;
import com.dsa.example.depinj.service.ConstructorInjectedController;
import com.dsa.example.depinj.service.PropertyInjectedController;
import com.dsa.example.depinj.service.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		HelloController helloController = (HelloController) ctx.getBean("helloController");
		String greet = helloController.sayHello();
		System.out.println(greet);
		System.out.println("--------------Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("--------------Setter");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("--------------Constructor");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		
		System.out.println(constructorInjectedController.getGreeting());
		
		System.out.println("---------------i18n");
		i18nController i18nCont = ctx.getBean(i18nController.class);
		System.out.println(i18nCont.sayHello());
	}

}
