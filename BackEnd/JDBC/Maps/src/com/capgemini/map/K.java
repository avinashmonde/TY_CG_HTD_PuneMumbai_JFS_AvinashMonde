package com.capgemini.map;

import java.util.function.Supplier;

public class K {

	public static void main(String[] args) {
		Supplier <Student> s=()->
		{
			Student a = new Student();
			return a;
			
		};
		System.out.println(s);
	}

}
