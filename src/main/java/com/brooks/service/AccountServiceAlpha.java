package com.brooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.model.Account;
import com.brooks.model.Dog;
import com.brooks.repository.AccountRepository;

@Service("accountService")
public class AccountServiceAlpha implements AccountService{

	@Autowired
	private AccountRepository accountRepository;
	
	public AccountServiceAlpha() {}
	
	public AccountServiceAlpha(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	@Transactional
	public List<Account> getAllAccounts() {
		return accountRepository.getAllAccounts();
	}

	@Override
	@Transactional
	public Account getAccountByUsername(String username) {
		return accountRepository.getAccountByUsername(username);
	}
	
	@Override
	@Transactional
	public Account getAccountById(Long id) {
		return accountRepository.getAccountById(id);
	}
	
	@Override
	@Transactional
	public Account validateAccountLogin(String username, String password){
		return accountRepository.validateAccountLogin(username, password);
	}

	@Override
	public boolean createAccount(Account account) {
		if(account.getUsername() == null || account.getPassword() == null || account.getEmail() == null)
			return false;
		else {
			accountRepository.createAccount(account);
			return true;
		}
	}

	@Override
	public void updateAccount(String username, Account account) {
		accountRepository.updateAccount(username, account);
	}

	@Override
	public void deleteAccount(String username) {
		accountRepository.deleteAccount(username);
	}



}
