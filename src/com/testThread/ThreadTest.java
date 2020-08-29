package com.testThread;

/**
 * @author Administrator
 *
 */
public class ThreadTest {
	public static void main(String args[]) {
		Xyz r = new Xyz();
		Thread t = new Thread(r);
		t.start();	
		Thread t1 = new Thread(r);
		t1.start();
	}
}

/**
 * @author Administrator
 *
 */

class Xyz implements Runnable {
	
	int i=30;

	public void run() {
		while (true) {
			System.out.println("Hello " + i++);
			if (i == 50)
				break;
			try {
				Thread.sleep(10);
				}catch(InterruptedException e){
					System.out.println(e.toString());
				
			}finally{
				continue;
			}
		}
	}
}