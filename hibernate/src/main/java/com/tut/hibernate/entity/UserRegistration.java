package com.tut.hibernate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_registration")
public class UserRegistration implements Serializable {
	
	@Id
	@GenericGenerator(name = "user_auto", strategy = "increment")
	@GeneratedValue(generator = "user_auto")

	@Column(name = "id")
	private long id;
	
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "mobile_number")
	private String mobilenumber;
	
	@Column(name = "email")
	private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String string) {
		this.mobilenumber = string;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", username=" + username + ", password=" + password + ", mobilenumber="
				+ mobilenumber + ", email=" + email + "]";
	}
	
	
	
}
