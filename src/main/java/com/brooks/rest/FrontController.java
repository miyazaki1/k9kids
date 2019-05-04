package com.brooks.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.brooks.ajax.ClientMessage;
import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface FrontController {

	List<Account> getAllAccounts();
	ResponseEntity<Account> getAccountByUsername(Account account, HttpServletRequest request);
	ResponseEntity<ClientMessage> createAccount(Account account);
	ResponseEntity<ClientMessage> updateAccount(String username, Account account);
	ResponseEntity<ClientMessage> deleteAccount(Account account);
	
	List<Dog> getAllDogs();
	Dog getDogByBreed(Dog dog);
	void createDog(Dog dog);
	Dog updateDog(Dog dog);
	void deleteDog(Dog dog);
}
