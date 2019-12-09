package com.capgemini.map;

import java.util.function.Predicate;

public class TestH {

	public static void main(String[] args) {
		Predicate<Student> s=i->{
			if(i.percentage >35)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		Student s1 = new Student("Avi",23,56.27);
		boolean res=s.test(s1);
	}

}
