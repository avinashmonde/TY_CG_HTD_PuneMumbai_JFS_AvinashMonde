package com.capgemini.collection.list;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("priya");
		al.add(2);
		al.add('F');
		al.add(5.6);
		
		for(Object b:al)
		{
			System.out.println(b);
		}
	}

}
