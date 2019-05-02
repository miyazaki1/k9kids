package com.brooks.repository;

import java.util.List;

import com.brooks.model.Dog;

public interface DogRepository {
	List<Dog> getAllDogs();
	Dog getDogByBreed (String breed);
}
