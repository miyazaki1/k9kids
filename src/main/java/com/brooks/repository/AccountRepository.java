package com.brooks.repository;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface AccountRepository {
	List<Account> getAllAccounts();
	Account getAccountByUsername (String username);
	public Account getAccountById(Long id);

	void createAccount(Account account);
	void updateAccount(String username, Account account);
	void deleteAccount(String username);
	
	Account validateAccountLogin(String username, String password);

}
