package com.brooks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="XIO.DOG")
public class Dog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	@Column(name="id")
	private int id;
	
	@Column(name="account_id")
	private int account_id;
	
	@Column(name="breed_id")
	private int breed_id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "user_id", nullable = false)
	private Account account;
	
	public Dog() {}

	public Dog(int id, int account_id, int breed_id, Account account) {
		super();
		this.id = id;
		this.account_id = account_id;
		this.breed_id = breed_id;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public int getBreed_id() {
		return breed_id;
	}

	public void setBreed_id(int breed_id) {
		this.breed_id = breed_id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + account_id;
		result = prime * result + breed_id;
		result = prime * result + id;
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
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (account_id != other.account_id)
			return false;
		if (breed_id != other.breed_id)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", account_id=" + account_id + ", breed_id=" + breed_id + ", account=" + account + "]";
	}

	
}