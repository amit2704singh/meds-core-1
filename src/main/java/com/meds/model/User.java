package com.meds.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User {
//amit singh to check changes 
//second change
//third change
//ffoourth
	@Id
	private long id;
	@Column(name = "user_id")
	private String userId;
	private String password;
	@Column(name = "first_name")
	private String firtNmae;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	private Date dob;
	@Column(name = "last_login")
	private Date lastLogin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirtNmae() {
		return firtNmae;
	}

	public void setFirtNmae(String firtNmae) {
		this.firtNmae = firtNmae;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

}
