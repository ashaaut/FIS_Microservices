package com.fis.userservice.bean;

public class User {
	int id;
	String name;
	public User() {
		
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserController [id=" + id + ", name=" + name + "]";
	}
	
}