package com.capgemini.map;

import java.util.function.Consumer;

public class TestK {

	public static void main(String[] args) {
		Consumer <Student> a = s ->
		{
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Percentage is "+s.percentage);
		};
		Student s1 = new Student("Avinash123",99,98.34);
		a.accept(s1);
	}

}
