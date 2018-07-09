package com.santosh.controller;

import java.util.ArrayList;
import java.util.Date;

public class User {
	private String firstName;
	private String lastName;
	private Long mobileNo;
	private Date dob;
	private ArrayList<String> userSkills;
	private Address address;

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

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public ArrayList<String> getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(ArrayList<String> userSkills) {
		this.userSkills = userSkills;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
