package com.LinkedList;
import java.util.LinkedList;

	public class Data {


		LinkedList<Employee> setDataOfEmployee(){
			Employee e1 = new Employee();
			e1.setName("Rupesh");
			e1.setLoc("Mumbai");
			e1.setSalary(49000);
			e1.setDOJ(2020);
			
			Employee e2 = new Employee();
			e2.setName("Vaibhav");
			e2.setLoc("Pune");
			e2.setSalary(77000);
			e2.setDOJ(2021);
			
			Employee e3 = new Employee();
			e3.setName("Shanti");
			e3.setLoc("Ahmednagar");
			e3.setSalary(66000);
			e3.setDOJ(2020);
			
			Employee e4 = new Employee();
			e4.setName("Abhishek");
			e4.setLoc("Pune");
			e4.setSalary(69000);
			e4.setDOJ(2022);
			
			Employee e5 = new Employee();
			e5.setName("Mahesh");
			e5.setLoc("Nashik");
			e5.setSalary(46300);
			e5.setDOJ(2021);
			
			
			LinkedList<Employee> Empl = new LinkedList<>();
				Empl.add(e1);
				Empl.add(e2);
				Empl.add(e3);
				Empl.add(e4);
				Empl.add(e5);
				
				// System.out.println(Empl);
				
				// System.out.println("********************************");
				
				for(Employee employee : Empl) {
				//	System.out.println(employee);
				}
			return Empl;
		}
		
		public static void main(String[] args) {
			Data d = new Data();
			d.setDataOfEmployee();
		}
		
	}






