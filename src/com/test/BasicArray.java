package com.test;

public class BasicArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int thisArray[];
		int thatArray[];
		int array1[] = {1,2,3,4,5,6,7,8,9,10};
		int array2[] = new int[20];
		Factor m[];
		m = new Factor[20];
		
	   thisArray  =  array1;
	   thatArray  =  thisArray;
	   thatArray = array2;
	   
	   
		
		for (int i=0; i< thatArray.length; i++)
		{
			Factor factor=new Factor();
			thisArray[i] = factor.factorMethod(i);
	//		System.out.println("thisArray[" + i+"]="+ thisArray[i]);
	//		System.out.println("array1[" + i+"]="+ array1[i]);
	//		System.out.println("thatArray[" + i+"]="+ thatArray[i]);
		
		}*/
		
	//	EmpInfo employee = new EmpInfo(); //creates instance
		
	/*	employee.name = "Robert Javaman "; // initializes
		employee.designation = " Manager " ; // the three
		employee.department = " Coffee Shop " ; // members
		
		employee.print();
		
		EmpInfo employee1 = new EmpInfo(); //creates instance
		employee1.print();*/
		Manager manager  =  new Manager("ÕÅ·É", "Êñ¹ú");
		manager.setAalary(8000);
		System.out.println(manager.getDetails());
	
		
		 
//		Employee employee  =new Employee();
//		System.out.println(employee.getDetails());
		
//		manager.method(employee);
/*		System.out.println(employee.name + " is " +
				employee.designation + " at " +
				employee.department);*/
	}

	
}
