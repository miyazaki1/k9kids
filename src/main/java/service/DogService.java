package com.project.service;

import java.util.List;

import canine.project.model.Dog;

public interface DogService {
	List<Dog> findAllDogs ();
	public Dog getDog(String breed);
}
