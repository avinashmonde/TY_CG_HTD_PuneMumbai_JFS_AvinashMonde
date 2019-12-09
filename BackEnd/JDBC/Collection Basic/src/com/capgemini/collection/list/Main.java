package com.capgemini.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<Student>();
		
Student s1 = new Student(12,"Avi",65.76);

Student s2 = new Student(45,"Avinash",45.78);
	al.add(s1);
	al.add(s2);
	
	
	System.out.println("--------for loop------------");
	for(int i=0;i<=2;i++)
	{
		Student a= (Student)al.get(i);
		//System.out.println(a);
		System.out.println("Id is "+a.id);
		System.out.println("Name is"+a.name);
		System.out.println("Percentage is"+a.percentage);
	}
	System.out.println("---------for-each -----------");
	for(Student a:al)
	{
		//System.out.println(a);
		System.out.println("Id is "+a.id);
		System.out.println("Name is"+a.name);
		System.out.println("Percentage is"+a.percentage);
	}
	System.out.println("----------Iterator------------");
	Iterator<Student> a=al.iterator();
	while(a.hasNext()) {
		Student x = a.next();
		//System.out.println(x);
		System.out.println("Id is "+x.id);
		System.out.println("Name is"+x.name);
		System.out.println("Percentage is"+x.percentage);
		}
	System.out.println("----------ListIterator using forward--------");
	ListIterator<Student> a1=al.listIterator();
	while(a1.hasNext()) {
		Student x = a1.next();
		//System.out.println(x);
		System.out.println("Id is "+x.id);
		System.out.println("Name is"+x.name);
		System.out.println("Percentage is"+x.percentage);
		}
	System.out.println("----------ListIterator using backward--------");
	while(a1.hasPrevious()) {
		Student x = a1.previous();
		//System.out.println(x);
		System.out.println("Id is "+x.id);
		System.out.println("Name is"+x.name);
		System.out.println("Percentage is"+x.percentage);
		}
}
	}


