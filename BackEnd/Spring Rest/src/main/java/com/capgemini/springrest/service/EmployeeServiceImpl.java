package com.capgemini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.dao.EmployeeDAO;



@Service
public class EmployeeServiceImpl  implements EmployeeService{
@Autowired
	private EmployeeDAO dao;
	
	@Override
	public EmployeeInfoBean getEmployee(int empid) {
		return dao.getEmployee(empid);
	}

	@Override
	public EmployeeInfoBean authenticate(int empid, String pwd) {
		// TODO Auto-generated method stub
		return dao.authenticate(empid, pwd);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employeeInfoBean);
	}

	public boolean deleteEmployee(int empid) {
		return dao.deleteEmployee(empid);
		
	}
	
	public boolean  updateEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.updateEmployee(employeeInfoBean);
	}
	/*
	 * @Override public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
	 * // TODO Auto-generated method stub return dao; }
	 */

	@Override
	public List<EmployeeInfoBean> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
