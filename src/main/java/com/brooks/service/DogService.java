package com.brooks.service;

import java.util.List;

import com.brooks.model.Dog;

public interface DogService {
	List<Dog> getAllDogs ();
	public Dog getDogByBreed(int breed);
	void createDog(Dog dog);
	public Dog updateDog(Dog dog);
	void deleteDog(Dog dog);
}
