package com.capgemini.springcore.annotations.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {

	private String empName;
	private int empId;
	@Autowired(required = false)
	@Qualifier("dev")
	private DepartmentBean departmentBean;
	
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init Method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method");
	}
	
	

	
	
	
}
