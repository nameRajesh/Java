package com.santosh.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InterestValidator implements
		ConstraintValidator<IsValidInterest, String> {
	private String listOfValidInterest;

	@Override
	public void initialize(IsValidInterest isvalidInterest) {
		this.listOfValidInterest = isvalidInterest.listOfValidInterest();
	}

	@Override
	public boolean isValid(String userInterest, ConstraintValidatorContext arg1) {
		if (userInterest == null) {
			return false;
		}
		if (userInterest
				.matches(listOfValidInterest/* "Music|Football|Cricket|Hockey" */)) {
			return true;
		} else {
			return false;
		}

	}

}
