package com.testThread;

class MultiThreadDemo {
	public static void main(String args[]) {
		NewThreadThree ob1 = new NewThreadThree("One"); // start threads
		NewThreadThree ob2 =new NewThreadThree("Two");
		NewThreadThree ob3 =new NewThreadThree("Three");
		
		System.out.println("Thread One is alive: "
				+ ob1.t.isAlive());
				System.out.println("Thread Two is alive: "
				+ ob2.t.isAlive());
				System.out.println("Thread Three is alive: "
				+ ob3.t.isAlive());
		try {
			System.out.println("Waiting for child threads to finish.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			// wait for other threads to end
//			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}