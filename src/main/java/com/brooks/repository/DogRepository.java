package com.brooks.repository;

import java.util.List;

import com.brooks.model.Dog;

public interface DogRepository {
	List<Dog> getAllDogs();
	Dog getDogByUsername (String username);
	void createDog(Dog dog);
	void updateDog(String username, Dog dog);
	void deleteDog(String usrname);
}
