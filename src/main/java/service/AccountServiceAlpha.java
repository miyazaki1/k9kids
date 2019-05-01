package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import canine.project.model.Account;
import canine.project.repository.AccountRepository;
import canine.project.repository.AccountRepositoryHibernate;

public class AccountServiceAlpha implements AccountService{

	@Autowired
	private AccountRepository accountRepository= new AccountRepositoryHibernate();
	
	public AccountServiceAlpha() {}
	
	public AccountServiceAlpha(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	public List<Account> findAllAccounts() {
		return accountRepository.getAllAccounts();
	}

	public Account getAccount(String username) {
		return accountRepository.getAccountByUsername(username);
	}

}
