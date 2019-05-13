package com.brooks.service;

import java.util.List;

import com.brooks.model.Dog;

public interface DogService {
	List<Dog> getAllDogs ();
	public Dog getDogByUsername(String username);
	boolean createDog(Dog dog);
	public void updateDog(String username, Dog dog);
	public void deleteDog(String username);
}