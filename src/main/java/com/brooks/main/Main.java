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
	
	public static void main(String[] args) {
	}
}
