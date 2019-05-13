package com.brooks.repository;

import java.util.List;

import com.brooks.model.Breed;
import com.brooks.model.ImageShort;

public interface DogApiRepository {
	
	List<Breed> getAllBreeds();
	List<Breed> getBreedByUsername(String username);
	Breed getBreedInfoById(int breed_id);
	Breed getBreedInfoByName(String breed_name);
	ImageShort getImageIdByBreed(int breed_id);
}
