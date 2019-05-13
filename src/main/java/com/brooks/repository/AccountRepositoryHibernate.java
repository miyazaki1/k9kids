package com.brooks.repository;

import java.util.List;

import org.hibernate.Session;
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
	private SessionFactory sessionFactory;
	
	public AccountRepositoryHibernate() {}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccounts() {
		return sessionFactory.getCurrentSession().createCriteria(Account.class).list();
	}

	@Override
	public Account getAccountByUsername(String username) {
		return (Account) sessionFactory.getCurrentSession().get(Account.class, username);
	}
	
	@Override
	public Account validateAccountLogin(String username, String password) {
		try {			
			return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class, username)
					.add(Restrictions.like("username", username)).add(Restrictions.like("password", password))
					.list()
					.get(0);
		}
		catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
	
	@Override
	public void createAccount(Account account) {
		sessionFactory.getCurrentSession().save(account);
		
	}

	@Override
	public void updateAccount(String username, Account account) {
		Session session = sessionFactory.getCurrentSession();
		Account a = (Account) session.byId(Account.class).load(username);
		a.setFirst_name(account.getFirst_name());
		a.setLast_name(account.getLast_name());
		a.setPassword(account.getPassword());
		a.setEmail(account.getEmail());
	}

	@Override
	public void deleteAccount(String username) {
		Session session = sessionFactory.getCurrentSession();
		Account a = (Account) session.byId(Account.class).load(username);
		session.delete(a);
	}


}
