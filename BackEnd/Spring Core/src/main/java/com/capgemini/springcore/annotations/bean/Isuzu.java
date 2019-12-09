package com.capgemini.springcore.annotations.bean;

import com.capgemini.interfaces.Engine;

public class Isuzu implements Engine {

	@Override
	public int getCC() {
		// TODO Auto-generated method stub
		return 1700;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "4-stroke-petrol";
	}

}
