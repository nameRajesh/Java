package com.santosh.services;

import java.util.List;

import com.santosh.dto.User;

public interface UserService {
	public void insertData(User user);

	public List<User> getUserList();

	public void deleteData(String id);

	public User getUser(String id);

	public void updateData(User user);
}
