package com.capgemini.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Course {
	@Id
	@Column
private int Cid;
	@Column
private String Cname;

	@ManyToMany(mappedBy = "student")
	private List<Student> student;
	
	
public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
public int getCid() {
	return Cid;
}
public String getCname() {
	return Cname;
}
public void setCid(int cid) {
	Cid = cid;
}
public void setCname(String cname) {
	Cname = cname;
}


}
