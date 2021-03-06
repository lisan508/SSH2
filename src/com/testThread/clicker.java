package com.testThread;

//Demonstrate thread priorities.
class clicker implements Runnable {
	int click = 0;
	Thread t;
	private volatile boolean running = true;

	public clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}

	public void run() {
		while (running) {
			click++;
		}
	}

	public void stop() {
		running = false;
	}

	public void start() {
		t.start();
	}
}
