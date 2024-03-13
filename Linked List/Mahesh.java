package com.LinkedList;

import java.util.LinkedList;

public class Mahesh {
	
	void Mahii() {
		Operation op = new Operation();
		
		LinkedList<Employee>  dd = op.oprt();
		
		
		for(Employee employee : dd) {
			
			System.out.println(employee);
		}

		}
	
	public static void main(String[] args) {
		
		Mahesh  sh  = new Mahesh();
		sh.Mahii();
	}

}
