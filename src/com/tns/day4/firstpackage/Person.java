package com.tns.day4.firstpackage;

public class Person {
	//data members
	private String name;
	private String city;
	private int age;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	//constructors  
	public Person() {
		
	}
	public Person(String name, String city, int age) {
		
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	
	
	
	
	

}
