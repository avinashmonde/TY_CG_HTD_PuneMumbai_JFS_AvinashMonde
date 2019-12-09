package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileDisplay {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		MobileBean mobile = context.getBean("mobile",MobileBean.class); 
		
		System.out.println("Employee Id = "+mobile.getBrandname());
		System.out.println("Employee name = "+mobile.getModelname());
		System.out.println("Department Id = "+mobile.getPrice());
		System.out.println("Department name = "+mobile.getMobiledisplay().getDisplaysize());
		System.out.println(""+mobile.getMobiledisplay().getResolution());
	
}
}