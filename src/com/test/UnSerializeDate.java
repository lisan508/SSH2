package com.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class UnSerializeDate {
	UnSerializeDate() {
		Date d = null;
		try {
			FileInputStream f = new FileInputStream("date.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			d = (Date) s.readObject();
			System.out.println("Unserialized Date object from date.ser");
			f.close();
			System.out.println("Date: " + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String args[]) {
		new UnSerializeDate();
	}
}