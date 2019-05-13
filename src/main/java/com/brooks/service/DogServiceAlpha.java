package com.brooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.model.Dog;
import com.brooks.repository.DogRepository;
import com.brooks.repository.DogRepositoryHibernate;

@Service("dogService")
public class DogServiceAlpha implements DogService{

	@Autowired
	private DogRepository dogRepository = new DogRepositoryHibernate();
	
	public DogServiceAlpha() {}
	
	public DogServiceAlpha(DogRepository dogRepository) {
		super();
		this.dogRepository = dogRepository;
	}

	@Override
	@Transactional
	public List<Dog> getAllDogs() {
		return dogRepository.getAllDogs();
	}

	@Override
	@Transactional
	public Dog getDogByUsername(String username) {
		return dogRepository.getDogByUsername(username);
	}

	@Override
	public boolean createDog(Dog dog) {
		dogRepository.createDog(dog);
		return true;
	}

	@Override
	public void updateDog(String username, Dog dog) {
		dogRepository.updateDog(username, dog);
	}

	@Override
	public void deleteDog(String username) {
		dogRepository.deleteDog(username);
	}



}
