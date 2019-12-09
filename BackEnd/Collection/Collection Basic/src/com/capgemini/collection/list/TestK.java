package com.capgemini.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestK {

	public static void main(String[] args) {
		LinkedList li= new LinkedList();
		li.add(23);
		li.add("Avi");
		li.add(5.6);
		
		System.out.println("-----------for-each------------");
		for(Object a:li)
		{
			System.out.println(a);
		}
		System.out.println("-----------for-----------------");
		for(int i=0;i<3;i++)
		{
		Object r = li.get(i);
		System.out.println(r);
		}
		System.out.println("----------iterator-------------");
	Iterator a=li.iterator();
	while(a.hasNext()) {
		Object x = a.next();
		System.out.println(x);
		}
		System.out.println("------------forward-------------");
	ListIterator a1=li.listIterator();
	while(a1.hasNext()) {
		Object x=a1.next();
		System.out.println(x);
	}
	System.out.println("backward----------------------------");
	while(a1.hasPrevious()) {
		Object y=a1.previous();
		System.out.println(y);
	}
}
}