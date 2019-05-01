package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Dog;
import repository.DogRepository;
import repository.DogRepositoryHibernate;

public class DogServiceAlpha implements DogService{

	@Autowired
	private DogRepository dogRepository = new DogRepositoryHibernate();
	
	public DogServiceAlpha() {}
	
	
	public DogServiceAlpha(DogRepository dogRepository) {
		super();
		this.dogRepository = dogRepository;
	}

	public List<Dog> findAllDogs() {
		return dogRepository.findAllDogs();
	}

	public Dog getDog(String breed) {
		return dogRepository.findByBreed(breed);
	}

}
