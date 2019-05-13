package com.brooks.service;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface DogService {
	public List<Dog> getDogByUsername(Account account);
	boolean createFavoriteById(int id);
	boolean createFavorite(Dog dog);
	public void deleteFavorite(Dog dog);
}