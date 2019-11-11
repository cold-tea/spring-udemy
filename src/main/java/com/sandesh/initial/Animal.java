package com.sandesh.initial;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class Animal {
	
	@Value("${sandesh.name}")
	private String name;
	
	@Value("${sandesh.email}")
	private String email;
	
	private FortuneService fortune;
	
	public Animal() {}
	
	public Animal(FortuneService fortune) {
		this.fortune = fortune;
	}

	public void saySomething() {
		System.out.println("Said Hello!! " + name + " " + email);
	}
	
	public void printFortune() {
		if (fortune != null) {
			System.out.println("The fortune says::: " + fortune.getFortune());
			return;
		}
		System.out.println("No fortune to display");
	}
}
