package com.capgemini.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		ArrayList b = new ArrayList();
		b.add(34);
		b.add("Avinash");
		b.add(3.45);
		b.add("F");
		
		
		Iterator it= b.iterator();
		while(it.hasNext()) {
			Object r =it.next();
			System.out.println(r);
		}
	}

}
