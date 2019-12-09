package com.capgemini.springcore.beans;

import com.capgemini.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Eats pedigree");
	}

	@Override
	public void speak() {
		System.out.println("Boow Boow");
	}

	@Override
	public void walk() {
		System.out.println("Dog is walking");
	}

}
