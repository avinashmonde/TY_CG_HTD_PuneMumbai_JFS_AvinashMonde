package com.capgemini.springcore.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.bean.DepartmentBean;

public class DepartmentConfig {
	
	@Bean
	public DepartmentBean getDepartmentBean() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(102);
		bean.setDeptName("avi");
		return bean;
		
	}
	
	@Bean(name = "test")
	//@Primary
	public DepartmentBean getTestingTeam() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(103);
		bean.setDeptName("Test");
		return bean;
		
	}
	@Bean(name="dev")
	public DepartmentBean getDevelopmentTeam() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(104);
		bean.setDeptName("dev");
		return bean;
		
	}
	@Bean(name ="hr")
	public DepartmentBean getHrTeam() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(105);
		bean.setDeptName("hr");
		return bean;
	}
}
