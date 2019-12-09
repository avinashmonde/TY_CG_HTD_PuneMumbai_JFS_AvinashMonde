package com.capgemini.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestD {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("priya");
		a.add(2);
		a.add('F');
		a.add(5.6);
		
		Iterator i =a.iterator();
		while(i.hasNext()) {
			Object r=i.next();
			System.out.println(r);
		}
	}

}
