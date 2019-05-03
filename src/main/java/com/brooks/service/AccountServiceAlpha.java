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
	public boolean createAccount(Account account) {
		if(account.getUsername() == null || account.getPassword() == null || account.getEmail() == null)
			return false;
		else {
			accountRepository.createAccount(account);
			return true;
		}
	}

	@Override
	public Account updateAccount(Account account) {
		account.setFirst_name(account.getFirst_name());
		account.setLast_name(account.getLast_name());
		account.setEmail(account.getEmail());
		account.setPassword(account.getPassword());
		return accountRepository.updateAccount(account);
	}

	@Override
	public void deleteAccount(Account account) {
		accountRepository.deleteAccount(account);
	}

}
