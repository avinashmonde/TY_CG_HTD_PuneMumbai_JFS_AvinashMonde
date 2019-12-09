package com.capgemini.map;

import java.util.function.Predicate;

public class TestF {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->{
			if(i%2==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		};
		

boolean res= p.test(18);
System.out.println("Result is "+res);

	}
}
