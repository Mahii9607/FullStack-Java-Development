package com.Company;

import com.Bonus.Bonus;
import com.Department.Department;
import com.Employee.Employee;
import com.Management.Management;
import com.Project.Project;
import com.Salary.Salary;

public class CompanyMain {

	public static void main(String[] args) {
		
		//create an employee
	Employee employee = new Employee("Mahesh Nikam" , 2001);
	
	//create a department
	Department department = new Department("Engineering");
	
	//create a salary calculator
	
	Salary salaryCalculator = new Salary();
	
	//create a bonus calculator
	
	Bonus bonusCalculator = new Bonus();
	
	//create a project
	
	Project project = new Project("Waste Management Of Smart Cities Using Blokchain", employee);

	//create management instance
	Management management = new Management();
	
	//display employee details
	management.displayEmployeeDetails(employee , department , salaryCalculator , bonusCalculator , project);
	
	
	
	
	
	
	
}
}
