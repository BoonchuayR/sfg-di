package com.keereesoft.sfgdi;

import com.keereesoft.sfgdi.controllers.ConstructorInjectedController;
import com.keereesoft.sfgdi.controllers.MyController;
import com.keereesoft.sfgdi.controllers.PropertyInjectedController;
import com.keereesoft.sfgdi.controllers.SetterBaseController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("--------- Primary Bean");
		System.out.println(myController.getGreeting());

		System.out.println("--------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter Base");
		SetterBaseController setterBaseController = (SetterBaseController) ctx.getBean("setterBaseController");
		System.out.println(setterBaseController.getGreeting());

		System.out.println("--------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayGreeting());
	}

}
