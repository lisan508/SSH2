package com.testThread;

class PC {
	public static void main(String args[]) {
		Q q = new Q();
/*		q.valueSet = true;
		q.n=0;*/
		new Producer1(q);
		new Consumer1(q);
		System.out.println("Press Control-C to stop.");
	}
}