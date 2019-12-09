package com.capgemini.map;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestD {

	public static void main(String[] args) {
		
		
		ArrayList <Student>al1 = new ArrayList<Student>();
		Student s1 = new Student ("Avi",78,95.45);
		Student s2 = new Student ("Jay",56,45.56);
		Student s3 = new Student ("Viraj",30,76.38);
		
		
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student> al2 =new ArrayList<Student>();
		
		Student s4 = new Student ("Umesh",23,56.38);
		Student s5 = new Student ("Swapnil",13,78.36);
		
		al2.add(s4);
		al2.add(s5);
		
		ArrayList<Student> al3 = new ArrayList<Student>();
		

		Student s6 = new Student ("Teju",50,85.36);
		Student s7 = new Student ("Sneha",46,56.37);
		Student s8 = new Student ("Anu",17,46.38);
		Student s9 = new Student ("Swapy",46,78.36);
		
		
		al3.add(s6);
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		LinkedHashMap<String, ArrayList<Student>> hm = new LinkedHashMap<String, ArrayList<Student>>();
		
		hm.put("First",al1);
		hm.put("Second",al2);
		hm.put("Third",al3);
		
		ArrayList<Student> al= hm.get("First");
		Iterator<Student>it = al.iterator();
		while(it.hasNext())
		{
			Student s =it.next();
			System.out.println("Name is"+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Percentage is "+s.percentage);
		}
	}

}
