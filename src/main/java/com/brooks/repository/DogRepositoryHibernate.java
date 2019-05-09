package com.brooks.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	public Dog getDogByUserId(int user_id) {
		return (Dog) sessionFactory.getCurrentSession().get(Dog.class, user_id);
	}

	@Override
	public void createDog(Dog dog) {
		sessionFactory.getCurrentSession().save(dog);
	}

	@Override
	public void updateDog(int user_id, Dog dog) {
		Session session = sessionFactory.getCurrentSession();
		Dog d = (Dog) session.byId(Dog.class).load(user_id);
		d.setDescription(d.getDescription());
		d.setHeight(d.getHeight());
		d.setWeight(d.getWeight());
		d.setLifespan(d.getLifespan());
	}

	@Override
	public void deleteDog(int user_id) {
		Session session = sessionFactory.getCurrentSession();
		Dog d = (Dog) session.byId(Dog.class).load(user_id);
		session.delete(d);
	}

}
