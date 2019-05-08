package com.brooks.repository;

import java.util.List;

import com.brooks.model.Account;

public interface AccountRepository {
	List<Account> getAllAccounts();
	Account getAccountByUsername (String username);
	Account validateAccountLogin(String username, String password);
	void createAccount(Account account);
	Account updateAccount(Account account);
	void deleteAccount(Account account);
}
