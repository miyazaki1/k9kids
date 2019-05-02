package com.brooks.util;

import com.brooks.ajax.ClientMessage;

public class ClientMessageUtil {
	public static final ClientMessage REGISTER_SUCCESS = new ClientMessage("Account created!");
	public static final ClientMessage ACCOUNT_ERROR = new ClientMessage("Error in creating account");
}
