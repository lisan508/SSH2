package com.testThread;

class Producer1 implements Runnable {
	Q q;

	Producer1(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
//		System.out.println("Producer:"+i);
		while (true) {
			q.put(i++);
		}
	}
}