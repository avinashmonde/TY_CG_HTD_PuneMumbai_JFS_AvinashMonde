package com.capgemini.map;

import java.util.Map;
import java.util.TreeMap;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		hm.put("ondhu",1);
		hm.put("idhu",5);
		hm.put("hathu", 10);
		hm.put("eradu", 2);
		
		for(Map.Entry<String, Integer> r:hm.entrySet())
		{
			String k= r.getKey();
			Integer v =r.getValue();
			System.out.println("Key is "+k);
			System.out.println("Value is"+v);
			System.out.println("------------");
		}
	}

}
