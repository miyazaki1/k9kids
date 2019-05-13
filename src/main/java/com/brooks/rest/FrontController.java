package com.brooks.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.brooks.ajax.ClientMessage;
import com.brooks.model.Account;
import com.brooks.model.Breed;
import com.brooks.model.Dog;
import com.brooks.model.ImageShort;

public interface FrontController {

	// ACCOUNTS TABLE
	List<Account> getAllAccounts();
	ResponseEntity<Account> getAccountByUsername(String username);
	ResponseEntity<Account> getAccountById(Long id);
	ResponseEntity<ClientMessage> createAccount(Account account);
	ResponseEntity<ClientMessage> updateAccount(String username, Account account);
	ResponseEntity<ClientMessage> deleteAccount(String username);

	// DOG TABLE
	List<Dog> getFavoritesByUsername(String username);
	ResponseEntity<ClientMessage> createFavorites(Dog dog);
	ResponseEntity<ClientMessage> deleteFavorite(Dog dog);
	
	// DOG API
	List<Breed> getAllBreeds();	
	List<Breed> getBreedByUsername(String username);

	Breed getBreedInfoByName(String breed_name);
	
	Breed getBreedInfoById(int breed_id);
	ImageShort getImageIdByBreed(int breed_id);
}
