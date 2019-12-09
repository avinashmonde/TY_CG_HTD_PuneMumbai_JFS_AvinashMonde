package com.capgemini.collection.list;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add("Chinnu");
		al.add(2.8);
		al.add('F');

		for (int i = 0; i < 4; i++) {
			Object r = al.get(i);
			System.out.println(r);
		}

	}

}
