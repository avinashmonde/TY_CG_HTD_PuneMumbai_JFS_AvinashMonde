package com.capgemini.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {

	public static void main(String[] args) {
		LinkedList <String>li= new LinkedList<String>();
		li.add("Avinash");
		li.add("Avi");
		li.add("Avinash123");
		System.out.println("--------for loop------------");
		for(int i=0;i<3;i++)
		{
			String a=li.get(i);
			System.out.println(a);
		}
		System.out.println("---------for-each -----------");
		for(String a:li)
		{
			System.out.println(a);
		}
		System.out.println("----------Iterator------------");
		Iterator<String> a=li.iterator();
		while(a.hasNext()) {
			String x = a.next();
			System.out.println(x);
			}
		System.out.println("----------ListIterator using forward--------");
		ListIterator<String> a1=li.listIterator();
		while(a1.hasNext()) {
			String x = a1.next();
			System.out.println(x);
			}
		System.out.println("----------ListIterator using backward--------");
		while(a1.hasPrevious()) {
			String x = a1.previous();
			System.out.println(x);
			}
	}

}
