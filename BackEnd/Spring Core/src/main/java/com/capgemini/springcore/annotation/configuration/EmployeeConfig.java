package com.capgemini.springcore.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.bean.DepartmentBean;
import com.capgemini.springcore.annotations.bean.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {
@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(101);
		employeeBean.setEmpName("Avinash");
		return employeeBean;
		
	}


}