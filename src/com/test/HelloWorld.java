package com.test;

public class HelloWorld {
	public static void main(String args[]) {
		int i = 0;

		String greetings[] = { "Hello world!", "No, I mean it!",
				"HELLO WORLD!!" };
		while (i < 8) {

try{		
			System.out.println(greetings[i]);
			
		
	}catch (ArrayIndexOutOfBoundsException e)
	
	{
		System.out.println( "Re-setting Index Value");
	//	i = -1;
		  System.out.println(" this is ArrayIndexOutOfBoundsException!!!!!!");
//		  System.exit(0);
	}finally{
		System.out.println("This is always printed");  
		System.out.println("Program end!!!!!");
		 
		  
	}
i++;
	}
}
}