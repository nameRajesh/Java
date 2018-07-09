package com.santosh.model;

public class Circle {
	private String name;

	public String getName() {
		System.out.println("inside circle getname");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle setter called");
		throw new RuntimeException();
	}

	public String setNameReturn(String name) {
		this.name = name;
		System.out.println("Circle name return called");
		return name;
	}
}
