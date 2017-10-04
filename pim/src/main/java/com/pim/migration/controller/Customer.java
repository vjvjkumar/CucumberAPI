package com.pim.migration.controller;

public class Customer {
	
	public Customer(String firstName,String lastName,String ssn,String location){
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
		this.location=location;
	}
	
	String firstName;
	String lastName;
	String ssn;
	String location;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
