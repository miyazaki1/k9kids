package com.brooks.service;

import java.util.List;

import com.brooks.model.Account;

public interface AccountService {
	List<Account> getAllAccounts();
	public Account getAccountByUsername(String username);
	boolean createAccount(Account account);
	public void updateAccount(String username, Account account);
	public void deleteAccount(String username);
	Account validateAccountLogin(String username, String password);
}
