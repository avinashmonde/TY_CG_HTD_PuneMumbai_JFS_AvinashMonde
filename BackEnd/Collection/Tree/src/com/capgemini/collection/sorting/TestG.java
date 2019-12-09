package com.capgemini.collection.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestG {

	public static void main(String[] args) {

		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(3);
		al.add(30);
		
		Comparator <Integer> comp= (i,j)->i.compareTo(j);
		Integer it =al.stream().max(comp).get();
		System.out.println("Max number is "+it);
		
		Integer min=al.stream().min(comp).get();
		System.out.println("Min number is "+min);
	}

}
