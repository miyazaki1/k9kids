package com.brooks.repository;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface DogRepository {
	List<Dog> getDogByUsername (Account uaccount);
	void createFavorite(Dog dog);
	void deleteFavorite(Dog dog);
}
