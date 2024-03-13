package com.ArrayList;

import java.util.ArrayList;

public class Data {

	ArrayList<Employee> setDataOfEmployee(){
		
		Employee e1 = new Employee();
		e1.setName("Rupesh");
		e1.setLoc("Mumbai");
		e1.setSalary(50000);
		e1.setDOJ(2024);
		
		Employee e2 = new Employee();
		e1.setName("Vaibhav");
		e1.setLoc("Pune");
		e1.setSalary(60000);
		e1.setDOJ(2022);
		
		Employee e3 = new Employee();
		e1.setName("Shanti");
		e1.setLoc("Ahmednagar");
		e1.setSalary(70000);
		e1.setDOJ(2021);
		
		
		Employee e4 = new Employee();
		e1.setName("Abhishek");
		e1.setLoc("Pune");
		e1.setSalary(80000);
		e1.setDOJ(2021);
		
		
		Employee e5 = new Employee();
		e1.setName("Mahesh");
		e1.setLoc("Nashik");
		e1.setSalary(90000);
		e1.setDOJ(2021);
		
		ArrayList<Employee> Empl = new ArrayList();
		Empl.add(e1);
		Empl.add(e2);
		Empl.add(e3);
		Empl.add(e4);
		Empl.add(e5);
		
		
		System.out.println(Empl);
		
		System.out.println("************************");
		
		for(Employee employee : Empl) {
			
			System.out.println(employee);
			
	}
	return Empl;

}
	public static void main(String[] args) {
	
		Data d = new Data();
		d.setDataOfEmployee();
		
		
	}
}
