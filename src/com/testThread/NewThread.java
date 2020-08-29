package com.testThread;

class NewThread implements Runnable {
	Thread t;

	NewThread(String threadname) {
		// Create a new, second thread
		t = new Thread(this, threadname);
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
	}

	// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(t.getName()+": " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}