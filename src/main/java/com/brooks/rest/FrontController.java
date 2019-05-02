package com.brooks.rest;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface FrontController {

	List<Account> getAllAccounts();
	Account getAccountByUsername(Account account);
	void createAccount(Account account);
	Account updateAccount(Account account);
	void deleteAccount(Account account);
	
	List<Dog> getAllDogs();
	Dog getDogByBreed(Dog dog);
	void createDog(Dog dog);
	Dog updateDog(Dog dog);
	void deleteDog(Dog dog);
}
