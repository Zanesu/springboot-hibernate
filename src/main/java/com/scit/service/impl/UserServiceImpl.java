package com.scit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.scit.dao.UserDao;
import com.scit.model.User;
import com.scit.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public User getUserByid(long id) {
		// TODO Auto-generated method stub
		return userDao.getOne(id);
	}

}
