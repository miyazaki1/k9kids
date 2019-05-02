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
	private String breed; 
	
	@Column(name="description")
	private String description; 
	
	@Column(name="weight")
	private double weight;
	
	@Column(name="height")
	private double height; 
	
	@Column(name="lifespan")
	private int lifespan;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getLifespan() {
		return lifespan;
	}
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	public Dog(int id, String breed, String description, double weight, double height, int lifespan) {
		super();
		this.user_id = id;
		this.breed = breed;
		this.description = description;
		this.weight = weight;
		this.height = height;
		this.lifespan = lifespan;
	}
	@Override
	public String toString() {
		return "Dog [id=" + user_id + ", breed=" + breed + ", description=" + description + ", weight=" + weight
				+ ", height=" + height + ", lifespan=" + lifespan + "]";
	} 
	

}
