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
	
	@Autowired
	public DogApiRepository dogApiRepository;

	@SuppressWarnings("unchecked")
	@Override
	public List<Dog> getDogByUsername(Account account) {	
		Session session = sessionFactory.getCurrentSession();
		// Looks for account_id matches on the Dog table with the Account id on the id Table
		List<Dog> dogs = session.createCriteria(Dog.class)
				.add(Restrictions.like("account_id", account.getId())).list();
		return dogs;
	}

	@Override
	public void createFavorite(Dog dog) {
		Session session = sessionFactory.getCurrentSession();	
		// Looks for a duplicate, if one entry already exists with matching parameters, and if it does not
		// exist, it will create a new entry, otherwise, it'll just do nothing.
		if(session.createCriteria(Dog.class)
				.add(Restrictions.like("account_id", dog.getAccount_id()))
				.add(Restrictions.like("breed_id", dog.getBreed_id())).list().size() < 1){
			sessionFactory.getCurrentSession().save(dog);		
		}
		else {
			System.out.println("Doggo already exists!!!");
		}		
	}

	@Override
	public void deleteFavorite(Dog dog) {	
		// This simply deletes the dog by the "id" of that table.
		Session session = sessionFactory.getCurrentSession();
		Dog d = (Dog) session.byId(Dog.class).load(dog.getId());
		session.delete(d);		
	}

	@Override
	public void createFavoriteById(int breed_id) {
		sessionFactory.getCurrentSession().save(dogApiRepository.getAllBreeds().get(breed_id));		
	}
}
