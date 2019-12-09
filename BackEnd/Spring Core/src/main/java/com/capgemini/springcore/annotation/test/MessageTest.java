package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.configuration.MessageConfig;
import com.capgemini.springcore.annotations.bean.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean messageBean = context.getBean(MessageBean.class);
		System.out.println("Message 1 = "+messageBean.getMessage());
		
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		System.out.println("Message 2 = "+messageBean2.getMessage());
		
		messageBean.setMessage("Avinash");
		System.out.println("Message 1 = "+messageBean.getMessage());
		System.out.println("Message 2 = "+messageBean2.getMessage());
		}
	
}
