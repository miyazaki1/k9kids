package com.brooks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="XIO.ACCOUNT")
public class Account {
	
	@Id
	@GeneratedValue(generator= "UUID")
	@GenericGenerator(name="UUID", strategy="org.hibernate.id.UUIDGenerator")
	@OneToMany
	//@JoinColumn(name="username", referencedColumnName= "username")
    String username;
	
	@Column(name="user_id")
    int user_id;
	
	@Column(name="first_name")
    String first_name;
	
	@Column(name="last_name")
    String last_name;
	
	@Column(name="password")
    String password;
	
	@Column(name="email")
    String email;
    
    public Account() {
        super();
    }
    
    public Account(int user_id, String first_name, String last_name, String username, String password, String email) {
        super();
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Account [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", username="
                + username + ", password=" + password + ", email=" + email + "]";
    }
    
    
}