package com.santosh.springhibernatecrud.service;

import java.util.List;

import com.santosh.springhibernatecrud.model.User;

public interface UserService {
	public void saveUser(User user); // create and update

	public List<User> listUsers();

	public User getUser(int id);

	public void deleteUser(int id);
}
