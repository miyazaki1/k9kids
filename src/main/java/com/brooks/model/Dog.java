package com.brooks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="XIO.DOG")
public class Dog {
	
	@Id
	@GeneratedValue(generator= "UUID")
	@GenericGenerator(name="UUID", strategy="org.hibernate.id.UUIDGenerator")
	@Column(name="user_id")
	String user_id;
	
	@Column(name="username")
	String username;
	
	@Column(name="breed")
	int breed;

	public Dog() {}

	public Dog(String user_id, String username, int breed) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.breed = breed;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + breed;
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
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
		return "Dog [user_id=" + user_id + ", username=" + username + ", breed=" + breed + "]";
	}

	

	
}
