package com.capgemini.thread;

public class PVR {

	synchronized void conform() {
		for (int i = 0; i <= 4; i++) {
			System.out.println(i);
			
			try {
				
				Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	synchronized void leave()
	{
	
		System.out.println("Notify me");
		notify();
	}
}
