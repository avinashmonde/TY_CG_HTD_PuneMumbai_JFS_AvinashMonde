package com.capgemini.springcore.annotations.bean;

import com.capgemini.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating bamboo");
	}

	@Override
	public void speak() {
		System.out.println("Squeak");
	}

	@Override
	public void walk() {
		System.out.println("Panda is walking");
	}

}
