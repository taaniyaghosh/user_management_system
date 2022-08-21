package com.xadmin.usermanagement.bean;

public class User {
	
	private int id;
	private String name;
	private String gender;
	private String age;
	private String email;
	private String country;
	
	
	public User(String name, String gender, String age, String email, String country) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	public User(int id, String name, String gender, String age, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.country = country;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
