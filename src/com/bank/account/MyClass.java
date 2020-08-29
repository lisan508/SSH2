package com.bank.account;
class MyClass {
	static int statInt = 4;
	static double statDouble = 16.0;
	int instInt;
	double instDouble;

	public static void statMethod() {
		System.out.println("statInt=" + statInt + ";statdouble=" + statDouble);
	}

	public void instMethod() {
		System.out.println("instInt=" + instInt + ";instdouble=" + instDouble);
	}

	public MyClass(int intArg, double doubleArg) {
		instInt = intArg;
		instDouble = doubleArg;
	}

	public static void main(String args[]) {
		MyClass instance1 = new MyClass(1, 2.0);
		MyClass instance2 = new MyClass(3, 4.0);
     	MyClass.statMethod(); // Outputs:statInt=4;
//		// statDouble=16.0
		instance1.instMethod(); // Outputs:instInt=1;
//		// instDouble=2.0
    	instance1.statMethod(); // Outputs:statInt=4;
//		// statDouble=16.0
		instance2.instMethod(); // Outputs:instInt=3;
//		// instDouble=4.0
		instance2.statMethod(); // Outputs:statInt=4;
//		// statDouble=16.0
		
		
	}
}