package service;

import java.util.List;

import model.Dog;

public interface DogService {
	List<Dog> findAllDogs ();
	public Dog getDog(String breed);
}
