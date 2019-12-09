package com.capgemini.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("ondhu",1);
		hm.put("idhu",5);
		hm.put("hathu", 10);
		hm.put("eradu", 2);
		
		Set<String> s =hm.keySet();
		for(String r:s)
		{
			System.out.println(r);
		}
		
		Collection<Integer> col=hm.values();
		for(Integer x:col)
		{
			System.out.println(x);
		}
	}

}
