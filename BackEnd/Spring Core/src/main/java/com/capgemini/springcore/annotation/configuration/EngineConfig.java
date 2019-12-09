package com.capgemini.springcore.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.interfaces.Engine;
import com.capgemini.springcore.annotations.bean.Isuzu;
import com.capgemini.springcore.annotations.bean.Volkswagen;

@Configuration
public class EngineConfig {

	@Bean(name ="Isuzu")
	
	public Engine getIsuzu() {
		return new Isuzu();
		
	}
	
	@Bean(name = "Volkswagen")
	@Primary
	public Engine getVolkswagen() {
		return new Volkswagen();
	}
}
