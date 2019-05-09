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
	public Dog getDogByUserId(int user_id) {
		return dogRepository.getDogByUserId(user_id);
	}

	@Override
	public boolean createDog(Dog dog) {
		dogRepository.createDog(dog);
		return true;
	}

	@Override
	public void updateDog(int user_id, Dog dog) {
		dogRepository.updateDog(user_id, dog);
	}

	@Override
	public void deleteDog(int user_id) {
		dogRepository.deleteDog(user_id);
	}



}
