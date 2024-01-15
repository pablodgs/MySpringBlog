package com.example.myspringblog.core.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CommonUser {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private String email;
	private String password;
	
	public CommonUser() {
		super();
	}
	
	public CommonUser(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public CommonUser(Long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.email, this.password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CommonUser))
			return false;
		CommonUser user = (CommonUser) obj;
		return Objects.equals(this.id, user.id) && Objects.equals(this.name, user.name) 
				&& Objects.equals(this.email, user.email) && Objects.equals(this.password, user.password);
	}
	
	@Override
	public String toString() {
		return "CommonUser{" + "id=" + this.id + ", name='" + this.name + "\'" 
				+ ", email='" + this.email + "\'" + ", password='" + this.password + "\'" + "}";
	}
	
}
