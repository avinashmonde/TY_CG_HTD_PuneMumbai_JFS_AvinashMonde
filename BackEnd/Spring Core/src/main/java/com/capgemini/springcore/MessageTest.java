package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;
import com.capgemini.springcore.beans.MessageBean2;

public class MessageTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	//	((AbstractApplicationContext)context).registerShutdownHook();	//to execute destroy phase
		MessageBean messageBean = context.getBean("messageBean", MessageBean.class);
		
		System.out.println(messageBean.getMessage());
		
		
		((AbstractApplicationContext)context).close();// we should write at last or otherwise messagebean would not get printed
	}

}
