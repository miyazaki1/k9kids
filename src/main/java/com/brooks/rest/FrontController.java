package com.brooks.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.brooks.ajax.ClientMessage;
import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface FrontController {

	List<Account> getAllAccounts();
	ResponseEntity<Account> getAccountByUsername(String username, Account account);
	ResponseEntity<ClientMessage> createAccount(Account account);
	ResponseEntity<ClientMessage> updateAccount(String username, Account account);
	ResponseEntity<ClientMessage> deleteAccount(String username);
	
	List<Dog> getAllDogs();
	ResponseEntity<Dog> getDogByUsername(String username, Dog dog);
	ResponseEntity<ClientMessage> createDog(Dog dog);
	ResponseEntity<ClientMessage> updateDog(String username, Dog dog);
	ResponseEntity<ClientMessage> deleteDog(String username);
}
