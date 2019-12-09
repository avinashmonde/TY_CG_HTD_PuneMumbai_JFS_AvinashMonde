package com.capgemini.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@Column
	private int Sid;
	@Column
	private String Sname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",joinColumns=@JoinColumn(name="Sid"),inverseJoinColumns = @JoinColumn(name="Cid"))
	
	private List <Course> course;
	
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public int getSid() {
		return Sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	
}
