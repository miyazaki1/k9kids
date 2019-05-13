package com.brooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.model.Account;
import com.brooks.model.Dog;
import com.brooks.repository.DogRepository;

@Service("dogService")
public class DogServiceAlpha implements DogService{

	@Autowired
	private DogRepository dogRepository;;
	
	public DogServiceAlpha() {}
	
	public DogServiceAlpha(DogRepository dogRepository) {
		this.dogRepository = dogRepository;
	}

	@Override
	@Transactional
	public List<Dog> getDogByUsername(Account account) {
		return dogRepository.getDogByUsername(account);
	}

	@Override
	@Transactional
	public boolean createFavorite(Dog dog) {
		
		if(dog == null) { return false; }
		
		
		dogRepository.createFavorite(dog);
		return true;
	}

	@Override
	@Transactional
	public void deleteFavorite(Dog dog) {
		dogRepository.deleteFavorite(dog);
	}
}
