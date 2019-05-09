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
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="breed")
	private int breed;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getBreed() {
		return breed;
	}

	public void setBreed(int breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [user_id=" + user_id + ", breed=" + breed + "]";
	}

	public Dog(int user_id, int breed) {
		super();
		this.user_id = user_id;
		this.breed = breed;
	} 
	
	
	
}
