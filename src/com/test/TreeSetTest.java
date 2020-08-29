package com.test;

import java.util.TreeSet;
import javax.servlet.*;
import java.sql.*;

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		set.add(new Parent(3));
		set.add(new Child());
		set.add(new Parent(4));
		System.out.println(set.size());
		
/*		for (int i = 0; i < 10; i++) {
			System.out.println("Are you finished yet?");
			}
			System.out.println("Finally!");*/
			
			int i = 0;
			
			
			do {
			
			System.out.println("Are you finished yet?");
			i++;
			} while (i < 10);
			System.out.println("Finally!");
			
			while (i < 10) {
				System.out.println("Are you finished yet?");
				i++;
				}
				System.out.println("Finally!");
				
			
		System.gc();
	}
	

}
