package canine.project.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import canine.project.model.Dog;

public class DogRepositoryHibernate implements DogRepository{

	private SessionFactory sessionFactory;
	
	public DogRepositoryHibernate() {}
	
	@SuppressWarnings("unchecked")
	public List<Dog> findAllDogs() {
		return sessionFactory.getCurrentSession().createCriteria(Dog.class).list();
	}

	public Dog findByBreed(String breed) {
		try {
			return (Dog) sessionFactory.getCurrentSession().createCriteria(Dog.class)
					.add(Restrictions.like("breed", breed))
					.list()
					.get(0);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

}
