package com.capgemini.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestJ {

	public static void main(String[] args) {
		ArrayList<Double> d = new ArrayList<Double>();
		d.add(5.9);
		d.add(5.6);
		d.add(1.3);
		
		System.out.println("-----------------Forward");
		ListIterator m =d.listIterator();
		while(m.hasNext())
		{
		Object a=m.next();
		System.out.println(a);
		}
		System.out.println("Backward-----------------");
		while(m.hasPrevious())
		{
		Object a=m.previous();
		System.out.println(a);
		}
	}

}
