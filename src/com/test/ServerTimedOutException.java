package com.test;

public class ServerTimedOutException extends Exception {
	private String reason;
	private int port;

	public ServerTimedOutException(String reason, int port) {
		this.reason = reason;
		this.port = port;
	}

	public String getReason() {
		return reason;
	}

	public int getPort() {
		return port;
	}
}