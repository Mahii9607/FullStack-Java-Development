package com.Management;

import com.Bonus.Bonus;
import com.Department.Department;
import com.Employee.Employee;
import com.Project.Project;
import com.Salary.Salary;

public class Management {

	public void displayEmployeeDetails(Employee employee , Department department , Salary salary , Bonus bonus , Project project) {
		
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Department: " + department.getName());
		System.out.println("Salary: $" + salary.calulateSalary(employee));
        System.out.println("Bonus: $" + bonus.calculateBonus(employee));
        System.out.println("Project: " + project.getName());
	}
}
