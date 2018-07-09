package com.santosh.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InterestValidator implements
		ConstraintValidator<IsValidInterest, String> {

	@Override
	public void initialize(IsValidInterest isvalidInterest) {
	}

	@Override
	public boolean isValid(String userInterest, ConstraintValidatorContext arg1) {
		if (userInterest == null) {
			return false;
		}
		if (userInterest.matches("Music|Football|Cricket|Hockey")) {
			return true;
		} else {
			return false;
		}

	}

}
