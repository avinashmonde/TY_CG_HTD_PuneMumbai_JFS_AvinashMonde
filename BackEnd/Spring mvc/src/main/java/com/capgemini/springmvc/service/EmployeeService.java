package com.capgemini.springmvc.service;

import com.capgemini.springmvc.bean.EmployeeInfoBean;

public interface EmployeeService {
	
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empid, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	//public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);

}//End of Service Interface
