package com.brooks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DOG")
public class Dog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="dogSequence")
	@SequenceGenerator(name="dogSequence", sequenceName="DOG_SEQ", allocationSize=1)
	@Column(name="username")
	private String username;
	
	@Column(name="breed")
	private int breed;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBreed() {
		return breed;
	}

	public void setBreed(int breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [username=" + username + ", breed=" + breed + "]";
	}

	public Dog(String username, int breed) {
		super();
		this.username = username;
		this.breed = breed;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
