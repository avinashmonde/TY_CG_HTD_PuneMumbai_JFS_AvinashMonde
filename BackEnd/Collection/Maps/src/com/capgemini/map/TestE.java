package com.capgemini.map;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		ArrayList <Student1> al= new ArrayList<Student1>();
		
		Student1 s1 = new Student1(23,"Avi",'M',56.38);
		Student1 s2 = new Student1(56,"Jay",'M',32.56);
		Student1 s3 = new Student1(20,"Teju",'F',13.56);
		Student1 s4 = new Student1(13,"Namu",'F',16.54);
		Student1 s5 = new Student1(46,"Anu",'F',68.46);
		Student1 s6 = new Student1(76,"Panu",'F',46.57);
		Student1 s7 = new Student1(55,"Archit",'M',79.37);
		Student1 s8 = new Student1(44,"Himat",'M',88.54);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		
		Helper h = new Helper();
		h.displayTopper(al);
		
	}

}
