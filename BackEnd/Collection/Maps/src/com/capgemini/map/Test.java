package com.capgemini.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Ondhu",1);
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
