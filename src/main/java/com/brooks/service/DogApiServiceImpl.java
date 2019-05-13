package com.brooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.model.Breed;
import com.brooks.model.ImageShort;
import com.brooks.repository.DogApiRepository;

@Service("dogApiService")
public class DogApiServiceImpl implements DogApiService{

	@Autowired
	private DogApiRepository dogApiRepository;
		
	@Override
	@Transactional
	public List<Breed> getAllBreeds() {
		return dogApiRepository.getAllBreeds();
	}
	
	@Override
	@Transactional
	public List<Breed> getBreedByUsername(String username) {
		return dogApiRepository.getBreedByUsername(username);
	}

	@Override
	@Transactional
	public Breed getBreedInfoById(int breed_id) {
		return dogApiRepository.getBreedInfoById(breed_id);
	}

	@Override
	@Transactional
	public Breed getBreedInfoByName(String breed_name) {
		return dogApiRepository.getBreedInfoByName(breed_name);
	}
	
	@Override
	@Transactional
	public ImageShort getImageIdByBreed(int breed_id) {
		return dogApiRepository.getImageIdByBreed(breed_id);
	}
}
