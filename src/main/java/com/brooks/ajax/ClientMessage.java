package com.brooks.ajax;

public class ClientMessage {
	private String Message;

	public ClientMessage() {}

	public ClientMessage(String message) {
		super();
		Message = message;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	
}
