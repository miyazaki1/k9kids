package com.brooks.service;

import java.util.List;

import com.brooks.model.Account;
import com.brooks.model.Dog;

public interface AccountService {
	List<Account> getAllAccounts();
	public Account getAccountByUsername(String username);
	public Account getAccountById(Long id);
	
	boolean createAccount(Account account);
	public void updateAccount(String username, Account account);
	public void deleteAccount(String username);
	
	Account validateAccountLogin(String username, String password);
}
