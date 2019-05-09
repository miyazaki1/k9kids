package com.brooks.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brooks.model.Dog;

@Repository("dogRepository")
@Transactional
public class DogRepositoryHibernate implements DogRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	public DogRepositoryHibernate() {}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Dog> getAllDogs() {
		return sessionFactory.getCurrentSession().createCriteria(Dog.class).list();
	}

	@Override
	public Dog getDogByBreed(String username) {
		try {
			return (Dog) sessionFactory.getCurrentSession().createCriteria(Dog.class)
					.add(Restrictions.like("username", username))
					.list()
					.get(0);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	@Override
	public void createDog(Dog dog) {
		sessionFactory.getCurrentSession().save(dog);
	}

	@Override
	public Dog updateDog(Dog dog) {
		return (Dog) sessionFactory.getCurrentSession().save(dog);
	}

	@Override
	public void deleteDog(Dog dog) {
		
	}

}
