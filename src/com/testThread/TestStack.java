package com.testThread;

public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 CreateThread thread1= new CreateThread(true);
		 Thread t1 = new  Thread(thread1);
		 CreateThread thread2= new CreateThread(false);
		 Thread t2 = new  Thread(thread2);
		 t1.start();
//		 t2.start();

	}
	

}
