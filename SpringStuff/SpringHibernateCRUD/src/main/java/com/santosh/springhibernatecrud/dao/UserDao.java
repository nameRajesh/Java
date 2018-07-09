package com.santosh.springhibernatecrud.dao;

import java.util.List;

import com.santosh.springhibernatecrud.model.User;

public interface UserDao {

	public void saveUser(User user); // create and update

	public List<User> listUsers();

	public User getUser(int id);

	public void deleteUser(int id);
}
