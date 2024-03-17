package com.test;

public class Job2 extends Thread{

	
	@Override
	public void run() {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Shrushti");
	}

}
