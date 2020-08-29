package com.testThread;

class ThreadDemo {
	public static void main(String args[]) {
		NewThread t1=new NewThread("child Thread one"); // create a new thread
		NewThread t2=new NewThread("child Thread two");
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}