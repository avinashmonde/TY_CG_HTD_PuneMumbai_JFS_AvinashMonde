package com.capgemini.springboot.dao;

import java.util.List;

import com.capgemini.springboot.beans.EmployeeInfoBean;


public interface EmployeeDAO {

	public EmployeeInfoBean getEmployee(int empid);
	public EmployeeInfoBean authenticate (int empid, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean deleteEmployee(int empid);
	public List<EmployeeInfoBean> getAllEmployees();
	boolean updateEmployee(EmployeeInfoBean employeeInfoBean);

}
