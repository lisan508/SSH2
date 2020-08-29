package com.test;

public class VariantTest{
	public static int staticVar = 0; 
	public int instanceVar = 0; 
	public VariantTest(){
		staticVar++;
		instanceVar++;
		System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
	}
	public static void main(String[]  args){
		
		VariantTest  var1=new VariantTest();
		VariantTest  var2=new VariantTest();
		VariantTest  var3=new VariantTest();
		System.out.println("Math.ceil(11.3)"+ Math.ceil(11.3));
		System.out.println("Math.ceil(-11.3)"+ Math.ceil(-11.3));
		System.out.println("Math.floor(11.6)"+ Math.floor(11.6));
		System.out.println("Math.floor(-11.6)"+ Math.floor(-11.6));
		System.out.println("Math.round(11.5)"+ Math.round(11.5));
		System.out.println("Math.round(-11.5)"+ Math.round(-11.5));
		Outer outer = new Outer();
		Outer.Inner1 inner1 = outer.new Inner1();

		
	}
}

