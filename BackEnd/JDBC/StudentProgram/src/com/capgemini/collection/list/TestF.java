package com.capgemini.collection.list;

import java.util.ArrayList;

public class TestF {

	public static void main(String[] args) {
		ArrayList<Double> d = new ArrayList<Double>();
		d.add(5.9);
		d.add(5.6);
		d.add(1.3);

		for (int i = 0; i < 3; i++) {
			Object r = d.get(i);
			System.out.println(r);
		}

	}

}
