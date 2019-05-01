package repository;

import java.util.List;

import model.Dog;

public interface DogRepository {
	List<Dog> findAllDogs();
	Dog findByBreed (String breed);
}
