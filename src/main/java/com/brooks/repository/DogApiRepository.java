package com.brooks.repository;

import java.util.List;

import com.brooks.model.Breed;

public interface DogApiRepository {
	
	List<Breed> getAllBreeds();
	Breed getBreedInfoById(int breed_id);
	Breed getBreedInfoByName(String breed_name);
	String getImageIdByBreed(int breed_id);
}
