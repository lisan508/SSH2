package com.test;

public class Factor {
	
	public  int  factorMethod(int y){
		int m ;
		
//		System.out.println("i=" + y);
		if (y>1){
		 m=y;	
		for(int i = y; i > 1;i--){
		 m=m*(i-1);
//		System.out.println("m=" + m);
		}
		}else{
			m= y;
		}
		 
		return m;
	} 
	
	public static void main(String args[]){
		
		Factor factor=new Factor();
	/*	System.out.println("0!=" + factor.factorMethod(0));
		System.out.println("1!=" + factor.factorMethod(1));
		System.out.println("2!=" + factor.factorMethod(2));
		System.out.println("3!=" + factor.factorMethod(3));
		System.out.println("4!=" + factor.factorMethod(4));
		System.out.println("6!=" + factor.factorMethod(6));
		System.out.println("10!=" + factor.factorMethod(10));
		System.out.println("15!=" + factor.factorMethod(15));
		*/
		int myArray[] = { 1, 2, 3, 4, 5, 6 };
		
		int hold[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.arraycopy(myArray, 0, hold, 0,myArray.length);
		
		for (int i=0; i< hold.length; i++)
		{
			System.out.println("hold[" + i+"]="+ hold[i]);
		}
		
	}

}
