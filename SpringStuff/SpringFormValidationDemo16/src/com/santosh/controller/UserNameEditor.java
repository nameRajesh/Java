package com.santosh.controller;

import java.beans.PropertyEditorSupport;

public class UserNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String firstName) throws IllegalArgumentException {
		if (firstName.contains("Mr.") || firstName.contains("Ms.")) {
			setValue(firstName);
		} else {
			firstName = "Ms." + firstName;
			setValue(firstName);
		}
	}
}
