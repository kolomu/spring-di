package com.kolomu.sfgdi;

import com.kolomu.sfgdi.controllers.MyController;
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
	}

}
