package com.capgemini.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvc.bean.EmployeeInfoBean;
import com.capgemini.springmvc.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		return dao.getEmployee(empId);
	}

	@Override
	public EmployeeInfoBean authenticate(int empid, String pwd) {
		return dao.authenticate(empid, pwd);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.addEmployee(employeeInfoBean);
	}

}//End of EmployeeService
