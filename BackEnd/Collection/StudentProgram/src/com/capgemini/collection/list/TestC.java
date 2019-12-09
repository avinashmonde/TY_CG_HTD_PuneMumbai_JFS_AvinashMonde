package com.capgemini.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestC {

	public static void main(String[] args) {
		ArrayList b = new ArrayList();
		b.add(34);
		b.add("Avinash");
		b.add(3.45);
		b.add("F");
		System.out.println("-----------------Forward");
		ListIterator m =b.listIterator();
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
