package com.capgemini.springcore.annotations.bean;

import com.capgemini.interfaces.Engine;

public class Volkswagen implements Engine {

	@Override
	public int getCC() {
		return 1300;
	}

	@Override
	public String getType() {
		return "A4 type";
	}

}
