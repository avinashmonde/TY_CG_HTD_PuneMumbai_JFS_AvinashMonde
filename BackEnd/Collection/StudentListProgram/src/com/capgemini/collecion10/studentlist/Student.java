package com.capgemini.collecion10.studentlist;

public class Student {

	int id;
	String name;
	double percentage; 
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercenatge() {
		return percentage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPercenatge(double percenatge) {
		this.percentage = percenatge;
	}

	public Student(int i, String string, double d) {
	
		this.id=i;
		this.name=string;
		this.percentage=d;
		
	}	
	
}
	
	
	

