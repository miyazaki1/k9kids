package com.brooks.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
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
		
		fca.getAccountByUsername("Brooks");
		System.out.println(fca.getAllAccounts().get(0));
	}
	
	//@Test
	public void testApi() {
//		AnnotationConfigApplicationContext annConfigContext = new AnnotationConfigApplicationContext("com.brooks");
//
//		RestTemplate rt = annConfigContext.getBean(RestTemplate.class);
//		ResponseEntity<List<Canine>> dogReq = rt.exchange("https://api.thedogapi.com/v1/breeds?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef", HttpMethod.GET,
//				null, new ParameterizedTypeReference<List<Canine>>() {
//				});
//		
//		List<Canine> dogs = dogReq.getBody();
//		
//		System.out.println(dogs.size());
//			
//		for (Canine dog : dogs) {
//			System.out.println(dog.toString());
//		}
//		
//		ResponseEntity<List<Image>> dogImages = rt.exchange("https://api.thedogapi.com/v1/images/search?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef", HttpMethod.GET,
//				null, new ParameterizedTypeReference<List<Image>>() {
//				});
//		
//		List<Image> dogI = dogImages.getBody();
//		for(Image img : dogI)
//		{
//			System.out.println(img.toString());
//		}
	}
}
