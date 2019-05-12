package com.brooks.repository;

import java.util.List;

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
		
		return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class, username)
				.add(Restrictions.like("username", username))
				.list()
				.get(0);
		
		//return (Account) sessionFactory.getCurrentSession().get(Account.class, username);
	}
	
	@Override
	public Account validateAccountLogin(String username, String password) {
		if (username == null || username == "") {
			return null;
		}
		
		try {		
			
			Session session = sessionFactory.getCurrentSession();
			
			Account account = (Account) session.createCriteria(Account.class, username)
					.add(Restrictions.like("username", username)).add(Restrictions.like("password", password))
					.list()
					.get(0);
			
						
			session.beginTransaction();
			session.getTransaction().commit();
			
			return account;
		}
		catch (IndexOutOfBoundsException e) {
			return null;
		}
		// To catch the sessionFactory.getCurrentSession().beginTransaction()
		catch (Exception e) {
			
			System.out.println("Exception when tying to beginTransaction to create a user session, opening a new session");
			sessionFactory.openSession();
			
			return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class, username)
					.add(Restrictions.like("username", username)).add(Restrictions.like("password", password))
					.list()
					.get(0);			
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
		
		//a.setUser_id(account.getUser_id());
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

	@Override
	public void addPreferencesToUser(List<Dog> dogs, Account account) {
		
//		Account user = getAccountByUsername(account.getUsername());
//		
//		int[] dog = new int[dogs.size()];
//		
//		for(int i =0; i < dog.length; i++) {
//			dog[i] = dogs.get(i).getBreed();
//		}
//		
//		
//		user.setDog_pref(dog);
	}

	@Override
	public Account addPreference(String username, int breed_id) {
		Account account = getAccountByUsername(username);
		
//		int[] breeds = new int[ account.getDog_pref().length + 1 ];
//		
//		breeds[breeds.length - 1] = breed_id;
//		
//		account.setDog_pref(b );
		
		return account;
	}


}
