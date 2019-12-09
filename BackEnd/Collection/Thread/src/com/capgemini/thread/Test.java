package com.capgemini.thread;

public class Test {

	public static void main(String[] args) {

		System.out.println("Main starts");
		Pen t = new Pen();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Pen p = new Pen();
		p.start();
		try {
			p.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main ends");

	}

}
