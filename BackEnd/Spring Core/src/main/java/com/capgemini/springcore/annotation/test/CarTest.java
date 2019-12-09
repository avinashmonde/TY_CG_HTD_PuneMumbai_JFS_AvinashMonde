package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotations.bean.Car;

public class CarTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("carCompany.xml");
		Car myCar = context.getBean("myCar", Car.class);
		System.out.println("Model Name = "+myCar.getModelName());
		System.out.println("Model Number = "+myCar.getModelNumber());
		System.out.println("Engine Details ");
		System.out.println("CC is = "+myCar.getEngine().getCC());
		System.out.println("Typ is = "+myCar.getEngine().getType());
	}
	
}
