package com.corasaniti.lambda.model;

public class Department {
	
	private String name;
    private String city;
    private String university;
    
    public Department(String name, String city, String university){
    	this.name=name;
    	this.city=city;
    	this.university=university;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
}
