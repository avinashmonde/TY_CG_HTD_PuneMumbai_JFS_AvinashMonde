package com.capgemini.collection11.sorting;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		ById id =new ById();
		TreeSet <Student>ts = new TreeSet<Student>(id);
	
		Student s1 =new Student();
		s1.setName("Viraj");
		s1.setId(23);
		s1.setPercentage(78.90);
		s1.setGender('M');
		
		Student s2 = new Student();
		s2.setName("Swapnil");
		s2.setId(56);
		s2.setPercentage(56.57);
		s2.setGender('M');
		
		Student s3 = new Student();
		s3.setName("Teju");
		s3.setId(18);
		s3.setPercentage(85.54);
		s3.setGender('F');
		
		Student s4= new Student();
		s4.setName("Nilesh");
		s4.setId(45);
		s4.setPercentage(45.68);
		s4.setGender('M');
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		
		for(Student a:ts)
		{
			System.out.println("Id is"+a.getId());
			System.out.println("Name is "+a.getName());
			System.out.println("Percentage is "+a.getPercentage());
			System.out.println("Gender is "+a.getGender());
		}
	}

}
