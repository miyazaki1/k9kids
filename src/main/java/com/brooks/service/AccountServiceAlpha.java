package com.brooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brooks.model.Account;
import com.brooks.repository.AccountRepository;
import com.brooks.repository.AccountRepositoryHibernate;

@Service("accountService")
public class AccountServiceAlpha implements AccountService{

	@Autowired
	private AccountRepository accountRepository= new AccountRepositoryHibernate();
	
	public AccountServiceAlpha() {}
	
	public AccountServiceAlpha(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	public List<Account> getAllAccounts() {
		return accountRepository.getAllAccounts();
	}

	public Account getAccountByUsername(String username) {
		return accountRepository.getAccountByUsername(username);
	}

	@Override
	public void createAccount(Account account) {
		accountRepository.createAccount(account);
		
	}

	@Override
	public Account updateAccount(Account account) {
		return accountRepository.updateAccount(account);
	}

	@Override
	public void deleteAccount(Account account) {
		accountRepository.deleteAccount(account);
	}

}
