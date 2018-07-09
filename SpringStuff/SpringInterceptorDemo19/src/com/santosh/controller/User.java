package com.santosh.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	@Pattern(regexp = "[^0-9]*")
	private String firstName;
	@Size(min = 2, max = 20 /*
							 * , message =
							 * "please enter the value for lastname between (2) {min} and (20){max}"
							 */)
	private String lastName;
	@Max(99999)
	private Long mobileNo;
	@Past
	private Date dob;
	private ArrayList<String> userSkills;
	private Address address;

	// @IsValidInterest(listOfValidInterest = "Music|Football|Cricket|Hockey")
	@IsValidInterest()
	private String userInterest;

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

	public String getUserInterest() {
		return userInterest;
	}

	public void setUserInterest(String userInterest) {
		this.userInterest = userInterest;
	}

}
