package com.capgemini.springcore.annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.interfaces.Engine;

public class Car {

	private int modelNumber;
	private String modelName;
	@Autowired
	private Engine engine;
	
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
