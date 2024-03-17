package com.test;

public class Job1 extends Thread {

	
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Mahesh");
	}

	
}
