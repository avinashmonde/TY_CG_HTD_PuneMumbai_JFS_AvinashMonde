package com.capgemini.springmvc.dao;

import com.capgemini.springmvc.bean.EmployeeInfoBean;

public interface EmployeeDAO {
	
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empid, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	//public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);

}//End of DAO Method
