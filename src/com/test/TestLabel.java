package com.test;

public class TestLabel {
	
	public static void main(String[] args){
/*		ok:
			
			for(int i=0;i<10;i++)	{
				for(int j=0;j<10;j++)		{
					System.out.println("i=" + i + ",j=" + j);
					if(j == 5) break ok;
				}
			} 
	System.out.println("Test OK");*/
		/*short s1 = 1; 
		s1 = (short) (s1 + 1);*/
		
		 short s1 = 1; s1 += 1;
		
/*		 int a= 2 <<8;
		 
		 System.out.println("a= " + a);
*/	
	int arr[][] = {{1,2,3},{4,5,6,7},{9}};
	boolean found = false;
	for(int i=0;i<arr.length && !found;i++)	{
			for(int j=0;j<arr[i].length;j++){
				System.out.println("i=" + i + ",j=" + j);
				if(arr[i][j]  == 5) {
					found = true;
					break;
				}
			}
		} 
	int a = Integer.MAX_VALUE;
	int b = Integer.MAX_VALUE;
	int sum = a + b;
	System.out.println("a=" + a +",b="+ b +",sum=" + sum);
	
	 final StringBuffer s=new StringBuffer("immutable");
//	 s=new StringBuffer("");
	 s.append(" broken!"); 
     System.out.println("s=" + s );
	}

}
