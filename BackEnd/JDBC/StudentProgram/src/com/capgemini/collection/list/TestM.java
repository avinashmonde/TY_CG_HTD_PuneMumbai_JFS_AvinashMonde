package com.capgemini.collection.list;

import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;
import java.util.Vector;

public class TestM {

	public static void main(Character[] args) {
		
	
		Vector <Character>v= new Vector<Character>();
		v.add('A');
		v.add('F');
		v.add('D');
		System.out.println("--------for loop------------");
		for(int i=0;i<3;i++)
		{
			Character a=v.get(i);
			System.out.println(a);
		}
		System.out.println("---------for-each -----------");
		for(Character a:v)
		{
			System.out.println(a);
		}
		System.out.println("----------Iterator------------");
		Iterator<Character> a=v.iterator();
		while(a.hasNext()) {
			Character x = a.next();
			System.out.println(x);
			}
		System.out.println("----------ListIterator using forward--------");
		ListIterator<Character> a1=v.listIterator();
		while(a1.hasNext()) {
			Character x = a1.next();
			System.out.println(x);
			}
		System.out.println("----------ListIterator using backward--------");
		while(a1.hasPrevious()) {
			Character x = a1.previous();
			System.out.println(x);
			}
	}

	}

