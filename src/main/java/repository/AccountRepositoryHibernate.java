package repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import model.Account;

public class AccountRepositoryHibernate implements AccountRepository{

	public SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Account> getAllAccounts() {
		return sessionFactory.getCurrentSession().createCriteria(Account.class).list();
	}

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

}
