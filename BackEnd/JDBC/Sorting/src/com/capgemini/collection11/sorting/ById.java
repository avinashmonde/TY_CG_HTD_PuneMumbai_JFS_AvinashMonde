package com.capgemini.collection11.sorting;

import java.util.Comparator;

public class ById implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		Integer a = s1.getId();
		Integer b = s2.getId();
		return a.compareTo(b);
	}

}
