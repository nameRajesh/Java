package com.santosh.model;

public class Triangle {
	private String name;
	
	private int height;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		System.out.println("inside triangle getname");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
