package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // instance container 
		EmployeeBean employeeBean =(EmployeeBean)context.getBean("employee"); // 1st Way
		EmployeeBean employeeBean2= context.getBean("employee1", EmployeeBean.class); // 2nd Way
		
		System.out.println("Employee Id: " + employeeBean.getEmpId());
		System.out.println("Employee Name: " + employeeBean.getEmpName());
		System.out.println("Employee Id: "+ employeeBean2.getEmpId());
		System.out.println("Employee Name: " + employeeBean2.getEmpName());
	}

}
