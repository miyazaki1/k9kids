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

@Repository("dogRepository")
@Transactional
public class DogRepositoryHibernate implements DogRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	public DogRepositoryHibernate() {}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dog> getDogByUsername(Account account) {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Dog> dogs = session.createCriteria(Dog.class)
				.add(Restrictions.like("account_id", account.getId())).list();
	
		System.out.println("==============================================SESSION: " + session.isOpen());
		System.out.println(dogs.size());

		
		return dogs;
	}

	@Override
	public void createFavorite(Dog dog) {
		sessionFactory.getCurrentSession().save(dog);
	}

	@Override
	public void deleteFavorite(Dog dog) {
		Session session = sessionFactory.getCurrentSession();
		Dog d = (Dog) session.byId(Dog.class).load(dog.getAccount_id());
		session.delete(d);		
	}

}
