package com.brooks.service;

import java.util.List;

import com.brooks.model.Breed;

public interface DogApiService {
	List<Breed> getAllBreeds();
	Breed getBreedInfoById(int breed_id);
	Breed getBreedInfoByName(String breed_name);
	String getImageIdByBreed(int breed_id);
}
