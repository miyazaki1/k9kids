package com.brooks.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brooks.model.Account;
import com.brooks.service.AccountService;
import com.brooks.service.DogService;

public class Main {
	public static Logger logger = Logger.getLogger(Main.class);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.html");
	
		DogService dogService = context.getBean("dogService", DogService.class);
		AccountService accountService = context.getBean("accountService", AccountService.class);
		
		//accountService.createAccount(new Account(0, "test", "testing", "ttesing", "pass123", "test@test.com"));
		
		logger.trace(accountService.getAllAccounts());
	}
}
