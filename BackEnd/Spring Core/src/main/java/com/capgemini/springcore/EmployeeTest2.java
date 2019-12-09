package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		EmployeeBean emp1 = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Enter Employee Id");
		int employeeId1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name");
		String employeeName1 = sc.nextLine();
		
		emp1.setEmpId(employeeId1);
		emp1.setEmpName(employeeName1);
		
		System.out.println("Emp 1 Id is " + emp1.getEmpId());
		System.out.println("Emp 1 Name is " + emp1.getEmpName());
		sc.nextLine();
		
		EmployeeBean emp2 = context.getBean("employee", EmployeeBean.class);
		
		System.out.println("Enter Employee Id");
		int employeeId2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name");
		String employeeName2 = sc.nextLine();
		
		emp2.setEmpId(employeeId2);
		emp2.setEmpName(employeeName2);
		
		System.out.println("Emp 1 Id is " + emp1.getEmpId());
		System.out.println("Emp 1 Name is " + emp1.getEmpName());
		System.out.println("Emp 2 Id is " + emp2.getEmpId());
		System.out.println("Emp 2 Name is " + emp2.getEmpName());
		
	};

}
