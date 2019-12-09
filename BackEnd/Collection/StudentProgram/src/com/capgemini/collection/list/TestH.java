package com.capgemini.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestH {

	public static void main(String[] args) {
		ArrayList<Double> d = new ArrayList<Double>();
		d.add(5.9);
		d.add(5.6);
		d.add(1.3);
		
		Iterator<Double> it=d.iterator();
		while(it.hasNext())
		{
			Double x=it.next();
			System.out.println(x);
		}
	}

}
