package com.sandesh.initial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	
	public static void main(String... args) {
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Animal animal = context.getBean("getAnimal", Animal.class);
		animal.saySomething();
		animal.printFortune();
		
		
		
		Animal animal2 = context.getBean("getAnimalNoService", Animal.class);
		animal2.saySomething();
		animal2.printFortune();
		context.close();
	}

}
