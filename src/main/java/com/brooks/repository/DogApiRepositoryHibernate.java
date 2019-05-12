package com.brooks.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.brooks.model.Canine;

@Repository("dogApiRepository")
@Transactional
public class DogApiRepositoryHibernate implements DogApiRepository{
	
	private final String apiUrl = "https://api.thedogapi.com/v1/breeds";
	private final String apiKey = "?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef";
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String getImageIdByBreed(int breed_id) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.brooks");
		RestTemplate rt = context.getBean(RestTemplate.class);

		List<Canine> dogReq = rt.exchange("?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Canine>>() {
				}).getBody();
		
		
		
		return null;
	}

}
