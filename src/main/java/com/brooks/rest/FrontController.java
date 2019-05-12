package com.brooks.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.brooks.ajax.ClientMessage;
import com.brooks.model.Account;
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
}
