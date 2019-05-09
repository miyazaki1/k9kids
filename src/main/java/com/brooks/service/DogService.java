package com.brooks.service;

import java.util.List;

import com.brooks.model.Dog;

public interface DogService {
	List<Dog> getAllDogs ();
	public Dog getDogByUserId(int user_id);
	boolean createDog(Dog dog);
	public void updateDog(int user_id, Dog dog);
	public void deleteDog(int user_id);
}