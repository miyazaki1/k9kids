package com.project.service;

import java.util.List;

import canine.project.model.Account;

public interface AccountService {
	List<Account> findAllAccounts();
	public Account getAccount(String username);
}
