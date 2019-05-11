package com.brooks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="XIO.DOG")
public class Dog {
	
	@Id
	//@ManyToMany
	@JoinColumn(name="username", referencedColumnName= "username")
	String username;
	
	@Column(name="breed")
	Long breed_id;

	public Dog() {
		super();
	}

	public Dog(String username, Long breed_id) {
		super();
		this.username = username;
		this.breed_id = breed_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getBreed_id() {
		return breed_id;
	}

	public void setBreed_id(Long breed_id) {
		this.breed_id = breed_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed_id == null) ? 0 : breed_id.hashCode());
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
		if (breed_id == null) {
			if (other.breed_id != null)
				return false;
		} else if (!breed_id.equals(other.breed_id))
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
		return "Dog [username=" + username + ", breed_id=" + breed_id + "]";
	} 
	
	
	
}
