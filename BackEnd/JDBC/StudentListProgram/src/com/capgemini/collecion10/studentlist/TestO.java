package com.capgemini.collecion10.studentlist;

import java.util.Collections;
import java.util.LinkedList;

public class TestO {

	public static void main(String[] args) {
		LinkedList<Double> al = new LinkedList<Double>();
		al.add(3.6);
		al.add(2.4);
		al.add(4.7);
		al.add(1.6);

		System.out.println("Before---------");
		Collections.sort(al);

		System.out.println("After----------");

	}

}
