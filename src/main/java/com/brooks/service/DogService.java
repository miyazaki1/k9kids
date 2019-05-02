package com.brooks.service;

import java.util.List;

import com.brooks.model.Dog;

public interface DogService {
	List<Dog> getAllDogs ();
	public Dog getDogByBreed(String breed);
}
