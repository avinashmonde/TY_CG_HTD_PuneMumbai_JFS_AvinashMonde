package com.capgemini.collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {

	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(3);
		al.add(30);
		
		List li =al.stream().map(i->i*2).collect(Collectors.toList());
	
	Iterator <Integer>it =li.iterator();
	while(it.hasNext()) {
		
	Integer a =it.next();
	System.out.println(a);
	}

	}
}
