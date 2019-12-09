package com.capgemini.collecion10.studentlist;

import java.util.ArrayList;

public class TestN {
	
	public static void main(String [] args) {
	ArrayList <Student> al = new ArrayList<Student>();
	
	Student s1=new Student(12,"avi",56.78);
	Student s2=new Student(23,"avinash",60.45);
	Student s3=new Student(78,"avinash123",85.78);
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	}
	void display(ArrayList<Student> al)
	{
		for(Student a: al)
		{
	System.out.println("Id is "+a.id);
	System.out.println("Name is "+a.name);
	System.out.println("Percentage is"+a.percentage);
	System.out.println("-------------------");
	}
	
}
}