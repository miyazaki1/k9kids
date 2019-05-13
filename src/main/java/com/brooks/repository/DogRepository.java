package com.brooks.repository;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface DogRepository {
	List<Dog> getDogByUsername (Account uaccount);
	void createFavorite(Dog dog);
	void createFavoriteById(int breed_id);
	void deleteFavorite(Dog dog);
}
