package service;

import java.util.List;

import model.Account;

public interface AccountService {
	List<Account> findAllAccounts();
	public Account getAccount(String username);
}
