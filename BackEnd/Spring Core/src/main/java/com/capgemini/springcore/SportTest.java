package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Sports;

public class SportTest {

	public static void main(String[] args) {
		 
		ApplicationContext  context = new ClassPathXmlApplicationContext("sportConfig.xml");
		Sports sport=context.getBean("sport",Sports.class);	//xml file id should be assign
		
		System.out.println("Name is "+sport.getName());
		System.out.println("Total Players "+sport.getTotalPlayers());
		System.out.println("team information "+sport.getTeamInfo());
	}
	
}
