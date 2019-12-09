package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;
import com.capgemini.springcore.beans.MessageBean;

public class DeptTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		EmployeeBean employeeBean = context.getBean("employee",EmployeeBean.class); 
		
		System.out.println("Employee Id = "+employeeBean.getEmpId());
		System.out.println("Employee name = "+employeeBean.getEmpName());
		System.out.println("Department Id = "+employeeBean.getDeptBean().getDeptid());
		System.out.println("Department name = "+employeeBean.getDeptBean().getDeptname());
		
	}

}
