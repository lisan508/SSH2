package com.test;

public class Employee {
//  private String name;
	private int salary;
	
	String name;
	public Employee(String n) {
	name = n;
	}
	
	public void setAalary(int wages){
		
		salary = wages;
	};

	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
}