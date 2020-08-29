package com.test;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient {
	public static void main(String args[]) throws IOException {
		int c;
		Socket s1;
		InputStream s1In;
		DataInputStream dis;

		// Open your connection to sunbert, at port 5432
		s1 = new Socket("wjh", 5432);

		// Get an input file handle from the socket and read the input
		s1In = s1.getInputStream();
		dis = new DataInputStream(s1In);

		String st = new String(dis.readUTF());
		System.out.println(st);

		// When done, just close the connection and exit
		s1In.close();
		s1.close();
	}
}