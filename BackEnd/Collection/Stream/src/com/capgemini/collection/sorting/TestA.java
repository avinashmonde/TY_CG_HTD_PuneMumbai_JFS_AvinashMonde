package com.capgemini.collection.sorting;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestA {

	public static void main(String[] args) {

		Comparator<Employee> c=(e1,e2)->{
			if(e1.height>e2.height)
			{
				return 1;
			}
			else if(e1.height<e2.height)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
TreeSet <Employee>ts = new TreeSet<Employee>(c);
		
		Employee e1 = new Employee("Sunil",34,45.67);
		Employee e2 = new Employee("Sagar",89,68.57);
		Employee e3 = new Employee("Sachin",79,40.58);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		for(Employee e:ts) {
			System.out.println("Name is"+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("------------------");
		}
		
		
	}
}


