package com.capgemini.collection.sorting;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestB {

	public static void main(String[] args) {
		Comparator<Employee> c=(e1,e2)->e1.name.compareTo(e2.name);
		
TreeSet <Employee>ts = new TreeSet<Employee>(c);
		
		Employee e1 = new Employee("Sunil",34,45.67);
		Employee e2 = new Employee("Sagar",89,68.57);
		Employee e3 = new Employee("Sachin",79,40.58);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		Iterator<Employee> it= ts.iterator();
		while(it.hasNext())
		{
			
			Employee r =it.next();
			System.out.println("Id is"+r.id);
			System.out.println("Name is"+r.name);
			System.out.println("Height is"+r.height);
			System.out.println("------------");
		}
	}

}




