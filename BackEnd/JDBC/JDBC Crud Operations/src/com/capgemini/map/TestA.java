package com.capgemini.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestA {

	public static void main(String[] args) {
	
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
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

