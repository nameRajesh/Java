package com.santosh.springhibernatecrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santosh.springhibernatecrud.dao.UserDao;
import com.santosh.springhibernatecrud.model.User;
import com.santosh.springhibernatecrud.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Transactional(readOnly = true)
	public List<User> listUsers() {
		return userDao.listUsers();
	}

	@Transactional(readOnly = true)
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	@Transactional
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

}
