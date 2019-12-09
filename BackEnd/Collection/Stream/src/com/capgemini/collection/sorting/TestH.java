package com.capgemini.collection.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestH {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(3);
		al.add(30);

		List li = al.stream().sorted().collect(Collectors.toList());

		System.out.println(li);

	}

}
