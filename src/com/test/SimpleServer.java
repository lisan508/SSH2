package com.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String args[]) {
		ServerSocket s = null;
		Socket s1;
		String sendString = "Hello Net World!";
		OutputStream s1out;
		DataOutputStream dos;

		// Register your service on port 5432
		try {
			s = new ServerSocket(5432);
		} catch (IOException e) {
		}

		// Run the listen/accept loop forever
		while (true) {
			try {
				// Wait here and listen for a connection
				s1 = s.accept();

				// Get a communication stream for soocket
				s1out = s1.getOutputStream();
				dos = new DataOutputStream(s1out);

				// Send your string! (UTF provides machine-independent format)
				dos.writeUTF(sendString);

				// Close the connection, but not the server socket
				s1out.close();
				s1.close();
			} catch (IOException e) {
			}
		}
	}
}