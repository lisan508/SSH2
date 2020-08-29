package com.test;

/**
 * @author Administrator
 *
 */
public class RecursionArithmetic {
	
	
	 

	
	static int multiply(int n){         
		if(n==1||n==0)         
		return n;         
		else         
		return n*multiply(n-1);         
		}         
		   
	   static int nSum(int n){         
		if (n == 2 || n == 1)
			return n;
		else
			return nSum(n - 1) + nSum(n - 2);
	}
	   
		public static void main(String[] args){ 
		System.out.println(nSum(1));
		System.out.println(nSum(2));
		System.out.println(nSum(3));
		System.out.println(nSum(4)); 
		System.out.println(nSum(5));
		System.out.println(nSum(6)); 
		System.out.println(nSum(7));
		System.out.println(" a[100]= " +  nSum(15));
		System.out.println(" a[100]= " +  multiply(30));
		
		 final StringBuffer a=new StringBuffer("immutable");
//		 a=new StringBuffer("");
		 a.append("iiiia!");
		}        		

}
