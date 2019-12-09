package com.capgemini.map;

import java.util.function.Function;

public class TestI {

	public static void main(String[] args) {
		Function<Integer,Integer> r= i->i*i;
		
		int ans=r.apply(5) ;
		System.out.println("Square is "+ans);
	}

}
