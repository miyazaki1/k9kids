package com.brooks.repository;

import java.util.List;

import com.brooks.model.Account;

public interface AccountRepository {
	List<Account> getAllAccounts();
	Account getAccountByUsername (String username);
}
