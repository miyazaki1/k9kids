package com.brooks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOG")
public class Dog {
	
	@Id
	@Column(name="username")
	String username;
	
	@Column(name="breed")
	long breed;

	public Dog() {
		super();
	}

	public Dog(String username, long breed) {
		super();
		this.username = username;
		this.breed = breed;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getBreed() {
		return breed;
	}

	public void setBreed(long breed) {
		this.breed = breed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (breed ^ (breed >>> 32));
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed != other.breed)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [username=" + username + ", breed=" + breed + "]";
	}


	
}
