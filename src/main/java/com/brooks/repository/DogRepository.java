package com.brooks.repository;

import java.util.List;

import com.brooks.model.Dog;

public interface DogRepository {
	List<Dog> getAllDogs();
	Dog getDogByUserId (int user_id);
	void createDog(Dog dog);
	void updateDog(int user_id, Dog dog);
	void deleteDog(int user_id);
}
