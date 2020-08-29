package com.bank.account;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 *
 */

public class Account {
	
	
	  static void setAccount(){	
		Calendar rightNow = Calendar.getInstance();
		updateDate  = rightNow.getTime().toString();
		System.out.println("当前时间是：" + updateDate);
	}
	
	public String getUpdateDate() {
		return updateDate;
	}


	private int  coustomerID;
	private String name;
	private float  balance;
	private static String  updateDate  ;
	
	/**
	 * @param args
	 */
	public static void main(String args[]){
		  Account account = new Account();
//		  Account.setAccount();
		  Account account2 = new Account();
//		  account2.setAccount();
		  
		  Count count1 = new Count();
		  Count count2 = new Count(); 
		  Count count3 = new Count();
//		 setUpdateDate(rightNow.getTime().toString());
		
	}
	
	

}
