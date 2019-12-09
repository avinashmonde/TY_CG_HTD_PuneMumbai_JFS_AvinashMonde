package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotation.configuration.DepartmentConfig;
import com.capgemini.springcore.annotation.configuration.EmployeeConfig;
import com.capgemini.springcore.annotations.bean.DepartmentBean;
import com.capgemini.springcore.annotations.bean.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		
		System.out.println("Id is = "+employeeBean.getEmpId());
		System.out.println("Name is = "+employeeBean.getEmpName());
		System.out.println("Id is = "+employeeBean.getDepartmentBean().getDeptId());
		System.out.println("Name is = "+employeeBean.getDepartmentBean().getDeptName());
	//	System.out.println("Id is = "+employeeBean.getDepartmentBean().getDeptId());
		
		//((AbstractApplicationContext)context).close(); //first way to close
		((AbstractApplicationContext)context).registerShutdownHook();  //second way to close 
		
		
		
	}

}
