package canine.project.repository;

import java.util.List;

import canine.project.model.Dog;

public interface DogRepository {
	List<Dog> findAllDogs();
	Dog findByBreed (String breed);
}
