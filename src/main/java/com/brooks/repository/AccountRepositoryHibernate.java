package com.brooks.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.model.Account;

@Repository("accountRepository")
@Transactional
public class AccountRepositoryHibernate implements AccountRepository{
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public AccountRepositoryHibernate() {}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccounts() {
		return sessionFactory.getCurrentSession().createCriteria(Account.class).list();
	}

	@Override
	public Account getAccountByUsername(String username) {
		try {
			return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class)
					.add(Restrictions.like("username", username))
					.list()
					.get(0);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	@Override
	public void createAccount(Account account) {
		sessionFactory.getCurrentSession().save(account);
		
	}

	@Override
	public Account updateAccount(Account account) {
		return (Account) sessionFactory.getCurrentSession().save(account);
	}

	@Override
	public void deleteAccount(Account account) {
		
	}
	

}
