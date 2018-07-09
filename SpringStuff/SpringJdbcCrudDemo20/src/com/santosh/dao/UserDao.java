package com.santosh.dao;

import java.util.List;

import com.santosh.dto.User;

public interface UserDao {
	public void insertData(User user);

	public List<User> getUserList();

	public void updateData(User user);

	public void deleteData(String id);

	public User getUser(String id);

}
