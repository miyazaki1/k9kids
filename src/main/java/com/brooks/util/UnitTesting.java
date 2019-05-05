package com.brooks.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.brooks.model.Account;
import com.brooks.rest.FrontControllerAlpha;

public class UnitTesting {
	public final static Logger logger = Logger.getLogger(UnitTesting.class);
	
	public FrontControllerAlpha fca = new FrontControllerAlpha();
	
	@Test
	public void getAllAccounts() {	
		HttpServletRequest req = null;
		Account account = new Account();
		
		account.setUsername("Brooks");
		
		//fca.getAccountByUsername(account, req );
		//logger.trace(account);
		
		fca.getAccountByUsername("Brooks", null);
		System.out.println(fca.getAllAccounts().get(0));
	}
}
