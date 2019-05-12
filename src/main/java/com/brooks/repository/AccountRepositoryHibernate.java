package com.brooks.repository;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.model.Account;
import com.brooks.model.Dog;

@Repository("accountRepository")
@Transactional
public class AccountRepositoryHibernate implements AccountRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private DogRepository dogRepository;

	public AccountRepositoryHibernate() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccounts() {
		return sessionFactory.getCurrentSession().createCriteria(Account.class).list();
	}

	@Override
	public Account getAccountByUsername(String username) {
		return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class, username)
				.add(Restrictions.like("username", username)).list().get(0);
	}

	@Override
	public Account getAccountById(Long id) {
		try {
			Account a =  (Account) sessionFactory.getCurrentSession().createCriteria(Account.class, "id")
					.add(Restrictions.like("id", id)).list().get(0);
	
			return a;
		} catch (IndexOutOfBoundsException e) {	
			System.out.println("Index out of bound when searching for Id " + e);
			// Returns Null for createAccount's checkId
			return null;
		} 		
	}
	
	@Override
	public Account validateAccountLogin(String username, String password) {
		if (username == null || username == "") {
			return null;
		}
		
		try {
			Session session = sessionFactory.getCurrentSession();
			Account account = (Account) session.createCriteria(Account.class, username)
					.add(Restrictions.like("username", username)).add(Restrictions.like("password", password)).list()
					.get(0);

			session.beginTransaction();
			session.getTransaction().commit();

			return account;
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
		catch (Exception e) {
			// To catch the sessionFactory.getCurrentSession().beginTransaction()
			System.out.println(
					"Exception when tying to beginTransaction to create a user session, opening a new session");
			sessionFactory.openSession();

			return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class, username)
					.add(Restrictions.like("username", username)).add(Restrictions.like("password", password)).list()
					.get(0);
		}
	}

	@Override
	public void createAccount(Account account) {	
		
		account.setId(checkId(account.getId()));
		sessionFactory.getCurrentSession().save(account);
	}
	
	// Recursive
	// Operation is O(n) n = the number of operations it takes to find a null userId;
	private Long checkId(Long id) {
		
		// Recursive Opereration that Basically searches if id passed in has
		// duplicate id associated with another account. If there is, it will 
		// generate one randomly going through this recursive operation.
		
		// If the random value is then checked calling the same function over again 
		// until it finds an unused id number, it will return back that number.
		
		// This return operation can only be described as, "Cancer"
		return (getAccountById(id) != null) 
				? checkId((Long.valueOf((long) Math.random())))
				: id;
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
		// Euthanize the dogs :<
		euthanize(dogRepository.getDogByUsername(getAccountByUsername(username)));	
		Account a = (Account) session.byId(Account.class).load(username);
		session.delete(a);
	}
	
	// Cleans up the favorite list of the account about to be deleted.
	private void euthanize(List<Dog> dogs) {
		for (Dog dog : dogs) {
			dogRepository.deleteFavorite(dog);
		}
	}

}
