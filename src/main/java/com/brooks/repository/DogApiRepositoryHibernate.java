package com.brooks.repository;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.brooks.model.ImageShort;

@Repository("dogApiRepository")
@Transactional
public class DogApiRepositoryHibernate implements DogApiRepository{
	
	private final String apiUrl = "https://api.thedogapi.com/v1/";
	private final String apiBreed = "breeds";
	private final String apiKey = "?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef";
	
	private final String search = "images/search?include_breed=1&breed_id=";
	
	@Override
	public String getImageIdByBreed(int breed_id) {

		RestTemplate rt = new RestTemplate();

		System.out.println("Made it into getImage by breed id: " + breed_id);
		
		try {
			List<ImageShort> images = rt.exchange( 
					"https://api.thedogapi.com/v1/images/search?include_breed=1&breed_id=" + breed_id, HttpMethod.GET,
					null, new ParameterizedTypeReference<List<ImageShort>>() {
					}).getBody();
			
			return images.get(0).getUrl();
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println("There was not a breed at " + breed_id + " exeption " + e);
			return null;
		}
	}
}
