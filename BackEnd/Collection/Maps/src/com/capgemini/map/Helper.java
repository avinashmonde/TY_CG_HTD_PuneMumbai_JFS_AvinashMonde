package com.capgemini.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayPass(ArrayList<Student1> al) {
		List<Student1> li = al.stream().filter(i -> i.percentage > 35).collect(Collectors.toList());
		Iterator<Student1> it = li.iterator();
		while (it.hasNext()) {
			Student1 s = it.next();
			System.out.println("name is" + s.name);
			System.out.println("id is" + s.id);
			System.out.println("Gender is" + s.gender);
			System.out.println("Percentage is" + s.percentage);
			System.out.println("----------------");
		}
	}

	void displayFail(ArrayList<Student1> al) {
		List<Student1> li = al.stream().filter(i -> i.percentage < 35).collect(Collectors.toList());
		Iterator<Student1> it = li.iterator();
		while (it.hasNext()) {
			Student1 s = it.next();
			System.out.println("name is" + s.name);
			System.out.println("id is" + s.id);
			System.out.println("Gender is" + s.gender);
			System.out.println("Percentage is" + s.percentage);
			System.out.println("----------------");
		}
	}

	void displayPassMale(ArrayList<Student1> al) {
		List<Student1> li = al.stream().filter(i -> (i.percentage > 35) && i.gender == 'M')
				.collect(Collectors.toList());
		Iterator<Student1> it = li.iterator();
		while (it.hasNext()) {
			Student1 s = it.next();
			System.out.println("name is" + s.name);
			System.out.println("id is" + s.id);
			System.out.println("Gender is" + s.gender);
			System.out.println("Percentage is" + s.percentage);
			System.out.println("----------------");
		}
	}

	void displayFailFemale(ArrayList<Student1> al) {
		List<Student1> li = al.stream().filter(i -> (i.percentage < 35) && i.gender == 'F')
				.collect(Collectors.toList());
		Iterator<Student1> it = li.iterator();
		while (it.hasNext()) {
			Student1 s = it.next();
			System.out.println("name is" + s.name);
			System.out.println("id is" + s.id);
			System.out.println("Gender is" + s.gender);
			System.out.println("Percentage is" + s.percentage);
			System.out.println("----------------");
		}
	}

	void displayAll(ArrayList<Student1> al) {
		Iterator<Student1> it = al.iterator();
		while (it.hasNext()) {
			Student1 s = it.next();
			System.out.println("name is" + s.name);
			System.out.println("id is" + s.id);
			System.out.println("Gender is" + s.gender);
			System.out.println("Percentage is" + s.percentage);
			System.out.println("----------------");
		}

	}

	void displayTopper(ArrayList<Student1> al) {
		Comparator<Student1> comp = (i, j) -> {
			if (i.percentage > j.percentage) {
				return 1;
			} else if (i.percentage < j.percentage) {
				return -1;
			} else {
				return 0;
			}
		};

		Student1 it = al.stream().max(comp).get();
		System.out.println("Max Percentage is " + it.percentage);
		System.out.println("Name is "+it.name);
		System.out.println("Gender is "+it.gender);
		System.out.println("ID is "+it.id);
		
		

	}
}
