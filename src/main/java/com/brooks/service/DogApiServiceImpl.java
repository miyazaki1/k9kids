package com.brooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.repository.DogApiRepository;

@Service("dogApiService")
public class DogApiServiceImpl implements DogApiService{

	@Autowired
	private DogApiRepository dogApiRepository;
	
	@Override
	@Transactional
	public String getImageIdByBreed(int breed_id) {
		return dogApiRepository.getImageIdByBreed(breed_id);
	}
}
