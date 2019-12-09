package com.capgemini.springrest.service;

import java.util.List;

import com.capgemini.springrest.beans.EmployeeInfoBean;

public interface EmployeeService {

	public EmployeeInfoBean getEmployee(int empid);
	public EmployeeInfoBean authenticate(int empid, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empid);
	public List<EmployeeInfoBean> getAllEmployee();
	
	
}
