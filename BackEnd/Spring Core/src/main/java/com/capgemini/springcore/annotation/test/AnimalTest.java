package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.configuration.PetConfig;
import com.capgemini.springcore.annotations.bean.Pet;

public class AnimalTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet =context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().walk();
		pet.getAnimal().speak();
	}

}
