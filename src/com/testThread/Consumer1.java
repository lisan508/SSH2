package com.testThread;

class Consumer1 implements Runnable {
	Q q;

	Consumer1(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}