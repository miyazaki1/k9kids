package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Account;
import repository.AccountRepository;
import repository.AccountRepositoryHibernate;

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
