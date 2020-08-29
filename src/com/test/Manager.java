package com.test;

public class Manager extends Employee {
	
//	private String department;
	String department;
	public Manager(String s, String d) {
	super(s);
	department = d;
	}
	public String getDetails() {
		return super.getDetails() + // call parents'
			// method
				
			"\nDepartment: " + department;
			}
	
	public void method(Employee e) {
		
		if (e instanceof Manager) {
//		Manager m = (Manager)e;
			Manager m = (Manager)e;
		System.out.println( " This is the manager of " + m.department);
		}else{	
		System.out.println( " This is the manager of  Employee");
		}
		// rest of operation
		}
}