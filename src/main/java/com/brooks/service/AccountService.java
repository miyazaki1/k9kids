package com.brooks.service;

import java.util.List;

import com.brooks.model.Account;

public interface AccountService {
	List<Account> getAllAccounts();
	public Account getAccountByUsername(String username);
	boolean createAccount(Account account);
	public Account updateAccount(Account account);
	void deleteAccount(Account account);
}
