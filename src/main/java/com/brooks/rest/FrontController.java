package com.brooks.rest;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface FrontController {

	List<Account> getAllAccounts();
	Account getAccountByUsername(Account account);
	
	List<Dog> getAllDogs();
	Dog getDogByBreed(Dog dog);
}
