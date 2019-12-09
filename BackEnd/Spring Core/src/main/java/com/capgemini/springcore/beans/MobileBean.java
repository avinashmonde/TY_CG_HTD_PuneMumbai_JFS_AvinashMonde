package com.capgemini.springcore.beans;

public class MobileBean {

	private String brandname;
	private String modelname;
	private int price;
	private MobileDisplayBean mobiledisplay;
	
	public MobileBean() {
		System.out.println("---------------");
	}
	
	public MobileDisplayBean getMobiledisplay() {
		return mobiledisplay;
	}
	public void setMobiledisplay(MobileDisplayBean mobiledisplay) {
		this.mobiledisplay = mobiledisplay;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
