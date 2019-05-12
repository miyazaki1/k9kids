package com.brooks.repository;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface AccountRepository {
	List<Account> getAllAccounts();
	Account getAccountByUsername (String username);
	Account validateAccountLogin(String username, String password);
	void createAccount(Account account);
	void updateAccount(String username, Account account);
	void deleteAccount(String username);
	void addPreferencesToUser(List<Dog> dogs, Account account);
	Account addPreference(String username, int breed_id);
}
