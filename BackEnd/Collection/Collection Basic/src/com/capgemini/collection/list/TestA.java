package com.capgemini.collection.list;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(24);
		a.add("Chinnu");
		a.add(2.8);
		a.add('F');
		
		for(Object j:a)
		{
		System.out.println(j);
	}
	}
}
