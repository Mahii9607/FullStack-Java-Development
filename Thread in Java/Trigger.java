package com.test;

public class Trigger {
	
	
	public static void main(String[] args) {
		

		for(int i = 0; i<10; i++) {
			
			System.out.println("Shanti");
		}

		
		Job1 jb1 = new Job1();
		jb1.start();
		
		Job2 jb2 = new Job2();
		jb2.start();
		

		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Vaibhya");
			
		}

	}
}
 