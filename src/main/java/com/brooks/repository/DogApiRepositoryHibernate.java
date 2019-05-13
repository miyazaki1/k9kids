package com.brooks.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.brooks.model.Account;
import com.brooks.model.Breed;
import com.brooks.model.Dog;
import com.brooks.model.ImageShort;

@Repository("dogApiRepository")
@Transactional
public class DogApiRepositoryHibernate implements DogApiRepository{
	
	// Core
	private final String apiKey = "?x-api-key=8e134487-f355-40b5-9ea7-7ac0f6ddefef";
	private final String apiBaseURL = "https://api.thedogapi.com/v1/";
	// Functions
	private final String apiBreed = "breeds";
	private final String imageSearch = "images/search?include_breed=1&breed_id=";
	private final String breedInfo = "/search?q=";
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private DogRepository dogRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<Breed> getAllBreeds() {
		return restTemplate.exchange( 
				apiBaseURL + apiBreed + apiKey, HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Breed>>() {
				}).getBody();	
	}
	
	@Override
	public List<Breed> getBreedByUsername(String username) {
		Account a = accountRepository.getAccountByUsername(username);
		
		
		List<Breed> breeds = new ArrayList<Breed>();
		
	
		
		for(Dog dog : dogRepository.getDogByUsername(a)) {
			breeds.add(getBreedInfoById(dog.getBreed_id()));
		}
		
		
		return breeds;
	}
	
	@Override
	public Breed getBreedInfoById(int breed_id) {
		try {
			return getAllBreeds().get(breed_id);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("breed id: " + breed_id + " was an invalid id");
			// returning a default
			return getAllBreeds().get(0);
		}
	}
	
	@Override
	public Breed getBreedInfoByName(String breed_name) {
		return restTemplate.exchange( 
				apiBaseURL + apiBreed + breedInfo + breed_name, HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Breed>>() {
				}).getBody().get(0);	
	}

	@Override
	public ImageShort getImageIdByBreed(int breed_id) {
		try {
			List<ImageShort> images = restTemplate.exchange( 
					apiBaseURL +  imageSearch + breed_id, HttpMethod.GET,
					null, new ParameterizedTypeReference<List<ImageShort>>() {
					}).getBody();
			
			return images.get(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("There was not a breed at " + breed_id + " exeption " + e);
			return null;
		}
	}


}
