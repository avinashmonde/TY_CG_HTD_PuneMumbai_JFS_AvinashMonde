package com.capgemini.map;

import java.util.function.Function;

public class TestJ {

	public static void main(String[] args) {
		Function<Integer,Student> p = i->
		{
			Student s = new Student();
			
			s.id=i;
			return s;
		};
		
		Student s= p.apply(10);
		System.out.println("Id is"+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is"+s.percentage);
		
	}

}
