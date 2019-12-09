package com.capgemini.thread;

public class TestForPVRandPaytm {

	public static void main(String[] args) {
		PVR p =new PVR();
		Paytm py1 =new Paytm(p);
		Paytm py2 = new Paytm(p);
		
		py1.start();
		py2.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p.leave();
	}

}
