package com.lab1.oops;


public class Employee {

	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
	
		this.firstName = firstName;
		this.lastName = lastName;
	}

	String getFirstName() {
		return firstName;
	}

     String getLastName() {
		return lastName;
	}
	

}