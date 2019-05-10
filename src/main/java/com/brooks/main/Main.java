package com.brooks.main;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.brooks.model.Canine;
import com.brooks.model.Image;
import com.brooks.service.AccountService;
import com.brooks.service.DogService;

public class Main {
	public static Logger logger = Logger.getLogger(Main.class);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.html");
//	
//		DogService dogService = context.getBean("dogService", DogService.class);
//		AccountService accountService = context.getBean("accountService", AccountService.class);
		
		//accountService.createAccount(new Account(0, "test", "testing", "ttesing", "pass123", "test@test.com"));
		
		//logger.trace(accountService.getAllAccounts());

		AnnotationConfigApplicationContext annConfigContext = new AnnotationConfigApplicationContext("com.brooks");

		RestTemplate rt = annConfigContext.getBean(RestTemplate.class);
		ResponseEntity<List<Canine>> dogReq = rt.exchange("https://api.thedogapi.com/v1/breeds?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Canine>>() {
				});
		
		List<Canine> dogs = dogReq.getBody();
		
		System.out.println(dogs.size());
			
		for (Canine dog : dogs) {
			System.out.println(dog.toString());
		}

		
		ResponseEntity<List<Image>> dogImages = rt.exchange("https://api.thedogapi.com/v1/images/search?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Image>>() {
				});
		
		List<Image> dogI = dogImages.getBody();
		for(Image img : dogI)
		{
			System.out.println(img.toString());
		}
		
	}
}
