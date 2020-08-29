package com.bank.account;

/**
 * @author Administrator
 *
 */
public class Count {
	private int serialNumber;
	private static int counter = 0;

	public Count() {
		counter++;
		serialNumber = counter;
		System.out.println("serialNumber=" + serialNumber);
	}
}
