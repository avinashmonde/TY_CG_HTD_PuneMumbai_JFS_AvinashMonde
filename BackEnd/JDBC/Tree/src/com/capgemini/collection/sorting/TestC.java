package com.capgemini.collection.sorting;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestC {

	public static void main(String[] args) {
		PriorityQueue <Integer>p =new PriorityQueue<Integer>();
		
		p.add(45);
		p.add(23);
		p.add(78);
		
		Iterator<Integer> it =p.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

}
