package com.testThread;

public class ExtendThread {
	public static void main(String args[]) {
		new NewThreadOne(); // create a new thread
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}