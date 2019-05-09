package com.brooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public List<Dog> getAllDogs() {
		return dogRepository.getAllDogs();
	}

	public Dog getDogByBreed(int breed) {
		return dogRepository.getDogByBreed(breed);
	}

	@Override
	public void createDog(Dog dog) {
		dogRepository.createDog(dog);
		
	}

	@Override
	public Dog updateDog(Dog dog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDog(Dog dog) {
		
	}



}
