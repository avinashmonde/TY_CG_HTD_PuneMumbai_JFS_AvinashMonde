package com.capgemini.springcore.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.annotations.bean.MessageBean;

@Configuration
public class MessageConfig {
	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hello World");
		return messageBean;
		
	}
	
}
