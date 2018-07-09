package com.santosh.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = InterestValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidInterest {
	
	String listOfValidInterest() default "Music|Football|Cricket|Hockey";

	String message() default "Please provide a valid interest;"
			+ "accepted interests are- Music, Football, Cricket, Hockey ";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
