package com.kolomu.sfgdi;

import com.kolomu.sfgdi.controllers.ConstructorInjectedController;
import com.kolomu.sfgdi.controllers.MyController;
import com.kolomu.sfgdi.controllers.PropertyInjectedController;
import com.kolomu.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// This will return an Application Context!
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// Asking the spring context to search for controller!
		// Spring bean naming = ClassName but beginnign with lowercase
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("------- Property");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Property");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
