package com.Project;

import com.Employee.Employee;

public class Project {

	
	private String name;
	private Employee assignedEmployee;
	
	public Project(String name , Employee assignedEmployee) {
		this.name = name;
		this.assignedEmployee = assignedEmployee;
	}
	public String getName() {
		return name;
	}
	
	public Employee getAssignedEmployee() {
		return assignedEmployee;
		
	}
}
