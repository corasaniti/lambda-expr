package com.corasaniti.lambda.model;

public class Employee {
	
	private String name;
    private String lastName;
    private Double salary;
    private Department department;
    
    public Employee (String name, String lastName, Department department, Double salary){
    	this.name=name;
    	this.lastName=lastName;
    	this.department=department;
    	this.salary=salary;
    }
    
    public Employee (String name, String lastName){
    	this.name=name;
    	this.lastName=lastName;
    	this.department=null;
    	this.salary=0.0;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setName(Double salary) {
		this.salary = salary;
	}
    
}
