package com.sandesh.initial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sandesh.initial")
@PropertySource("key_value.properties")
public class SpringConfig {
	
	@Bean
	public FortuneService getFortune() {
		return new DummyFortuneService();
	}

	@Bean
	public Animal getAnimal() {
		return new Animal(getFortune());
	}
	
	@Bean
	public Animal getAnimalNoService() {
		return new Animal();
	}
}
