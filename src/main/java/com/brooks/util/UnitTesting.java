package com.brooks.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.brooks.model.Account;
import com.brooks.model.Canine;
import com.brooks.model.Image;
import com.brooks.rest.FrontControllerAlpha;

public class UnitTesting {
	public final static Logger logger = Logger.getLogger(UnitTesting.class);
	
	public FrontControllerAlpha fca = new FrontControllerAlpha();
	
	//@Test
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
