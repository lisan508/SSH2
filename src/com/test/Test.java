package com.test;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;


public class Test extends Date {

	public static void main(String[] args) {

		System.out.println("Main code: i=" + StaticInitDemo.i);

		new Test().test();

		// System.out.println(new Test().test());
		Vector newVector = new Vector();
		for (int i = 0; i < newVector.size(); i++) {
			Object obj = newVector.get(i);
			if (!newVector.contains(obj))
				newVector.add(obj);

		}

		/*
		 * String s1 = "a"; String s2 = s1 + "b"; String s3 = "a" + "b";
		 * System.out.println(s2); System.out.println(s2 == "ab");
		 * System.out.println(s2.equals("ab")); System.out.println(s3 == "ab");
		 * 
		 * 
		 * String orgStr = "1223,1122,243222"; String[] result =
		 * orgStr.split(",");
		 * 
		 * StringTokenizer tokener = StringTokenizer(orgStr, ","); String[]
		 * result = new String[tokener.countTokens()]; int i = 0; while
		 * (tokener.nextToken() != null) { result[i++] = tokener.nextToken(); }
		 * 
		 * for (int j = 0; j < result.length; j++) {
		 * System.out.println(result[j]); }
		 */

		// new Test().test();
	}

	private static StringTokenizer StringTokenizer(String orgStr, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	int test() {
		try {
			return func1();
		} finally {
			return func2();
		}
	}

	int func1() {
		System.out.println("func1");
		return 1;
	}

	int func2() {
		System.out.println("func2");
		return 2;
	}

	/*
	 * static int test() { int x = 1; try { return x; } finally { ++x; return x;
	 * 
	 * } }
	 */

	/*
	 * System.out.println(super.getClass().getName());
	 * System.out.println(getClass().getName());
	 * System.out.println(getClass().getSuperclass().getName()); String s =
	 * "Hello"; s = s + " world!"; System.out.println(s); SimpleDateFormat df =
	 * new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	 * System.out.println(df.format(new Date()));
	 * System.out.println(System.currentTimeMillis()); StringBuffer sbf = new
	 * StringBuffer(); for(int i=0;i<10000;i++) { sbf.append(i); }
	 * System.out.println(System.currentTimeMillis()); String str = new
	 * String(); for(int i=0;i<10000;i++) { str = str + i; }
	 * System.out.println(System.currentTimeMillis());
	 */
}

