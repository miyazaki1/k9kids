package com.brooks.repository;

import java.util.List;

import org.hibernate.Session;
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
	public Dog getDogByUsername(String username) {
		return (Dog) sessionFactory.getCurrentSession().get(Dog.class, username);
	}

	@Override
	public void createDog(Dog dog) {
		sessionFactory.getCurrentSession().save(dog);
	}

	@Override
	public void updateDog(String username, Dog dog) {
		Session session = sessionFactory.getCurrentSession();
		Dog d = (Dog) session.byId(Dog.class).load(username);
		//d.setBreed(d.getBreed());
	}

	@Override
	public void deleteDog(String username) {
		Session session = sessionFactory.getCurrentSession();
		Dog d = (Dog) session.byId(Dog.class).load(username);
		session.delete(d);
	}

}
