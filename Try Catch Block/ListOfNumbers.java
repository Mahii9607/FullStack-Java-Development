package com.Try_Catch;

import java.io.FileWriter;
import java.io.PrintWriter;

public class ListOfNumbers {

	int[] list = {5 ,6 ,8 ,9 ,2};
	
	public void writeList() {
		PrintWriter out = null;
		
		try {
			System.out.println("Entering try Statement ");
			
			out = new PrintWriter(new FileWriter("Output.txt"));
			
			for( int i = 0 ; i < 7 ; i++) {
				
				System.out.println("Values at: " + i + " = " + list[i]);
			
			}
			
		}catch(Exception e) {
			System.out.println("Exception =>  " + e.getMessage());
		}finally {
			if(out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
				
			}else {
				System.out.println("PrintWriter not open");
			}
		}
	}
	
	public static void main(String[] args) {
		 ListOfNumbers list = new ListOfNumbers();
		 list.writeList();
	}

}
