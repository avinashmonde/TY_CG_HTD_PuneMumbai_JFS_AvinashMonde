package com.capgemini.collecion10.studentlist;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {
 void hello(ArrayList<Student>a)
 {
	 System.out.println("--------------for loop----------------");
	 for(int i=0;i<3;i++) {
		 Student r =a.get(i);
		 System.out.println(r.name);
		 System.out.println(r.id);
		 System.out.println(r.percentage);
	 }
	 System.out.println("-----------------for each----------------");
	 for(Student s:a) {
		 System.out.println(s.name);
		 System.out.println(s.id);
		 System.out.println(s.percentage);
	 }
 }

void onlyPass(ArrayList<Student> k) {
	Iterator <Student> a1= k.iterator();
	while(a1.hasNext()) {
		System.out.println("The passed students are:");
		Student s=a1.next();
		if(s.percentage>=35) {
			System.out.println(s.name);
			System.out.println(s.id);
			System.out.println(s.percentage);
		}
	}
	}
	
	void getDist(ArrayList<Student> a) {
		Iterator<Student> a1 =a.iterator();
		while(a1.hasNext()) {
			System.out.println("The distinction achieved students are: ");
			Student s =a1.next();
			if(s.percentage>=75) {
				System.out.println(s.name);
				System.out.println(s.id);
				System.out.println(s.percentage);
			}
		}
	
}








}
