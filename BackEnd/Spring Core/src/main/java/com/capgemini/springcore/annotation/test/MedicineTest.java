package com.capgemini.springcore.annotation.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Medicine;

public class MedicineTest {
	
	
public static void main(String[] args) {
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("medicineConfig.xml");
	
   Medicine medicine = context.getBean("medicine", Medicine.class);
   
   System.out.println("Medicine name is "+medicine.getName());
   System.out.println("Medicine price is "+medicine.getPrice());
   System.out.println("Medicine type is "+medicine.getType());
   System.out.println("Medicine drugs set are "+medicine.getDrugs());
			
}
}
