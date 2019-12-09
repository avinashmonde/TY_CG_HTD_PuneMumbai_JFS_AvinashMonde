package com.capgemini.springboot.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("employeeInfo")	// in json output to show name as employeeInfo
@XmlRootElement(name = "emp-info")	// in xml output to show as emp-info
@XmlAccessorType(XmlAccessType.FIELD)	// we used for xml identified type
@Entity
@Table(name = "employee_info")	// to specify that in DB we have name as given name
@JsonPropertyOrder({"employeeId","name", "designation"})	// to get output in such order as typed
@JsonInclude(JsonInclude.Include.NON_DEFAULT)	// in output not to show zero or null value
public class EmployeeInfoBean {

	
	@JsonProperty("employeeId")	// to show as json value in postman
	@XmlElement(name = "emp-id")	// to show as xml value in postman
	@Id
	@Column(name = "emp_id")
	private int empid;
	@JsonProperty("name")
	@XmlElement(name = "emp-name")
	@Column(name = "emp_name")
	private String empName;
	@Column
	@XmlElement
	private int age;
	@XmlElement
	@Column
	private double salary;
	@XmlElement
	@Column
	private String designation;
	@XmlElement
	@Column
	private char gender;
	@XmlElement
	@Column
	private long mobile;
	
	//@JsonIgnore
	@XmlElement
	@Column
	private String password;

	// @XmlElement
	
	public String getEmpName() {
		return empName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
