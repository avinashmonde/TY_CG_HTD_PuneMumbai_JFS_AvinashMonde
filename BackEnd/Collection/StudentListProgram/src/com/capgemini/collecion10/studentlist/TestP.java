package com.capgemini.collecion10.studentlist;

import java.util.ArrayList;
import java.util.Collections;

public class TestP {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add('a');
		al.add('x');
		al.add('m');
		Collections.sort(al);
		
		System.out.println(al);
	}

}
