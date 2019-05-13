package com.brooks.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.brooks.ajax.ClientMessage;
import com.brooks.model.Account;
import com.brooks.model.Breed;
import com.brooks.model.Dog;

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
	Breed getBreedInfoByName(String breed_name);
	Breed getBreedInfoById(int breed_id);
	String getImageIdByBreed(int breed_id);
}
