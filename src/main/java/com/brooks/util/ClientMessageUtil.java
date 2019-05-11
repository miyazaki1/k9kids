package com.brooks.util;

import com.brooks.ajax.ClientMessage;

public class ClientMessageUtil {
	public static final ClientMessage ACCOUNT_SUCCESSFUL = new ClientMessage("Account created!");
	public static final ClientMessage ACCOUNT_UNSUCCESSFUL = new ClientMessage("Error in creating account");
	public static final ClientMessage UPDATE_SUCCESSFUL = new ClientMessage("Updated!");
	public static final ClientMessage UPDATE_UNSUCCESSFUL = new ClientMessage("Unable to update");
	
	public static final ClientMessage DOG_SUCCESSFUL = new ClientMessage("Dog added!");
	public static final ClientMessage DOG_UNSUCCESSFUL = new ClientMessage("Unable to add dog");
}
