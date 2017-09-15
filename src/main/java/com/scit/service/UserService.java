package com.scit.service;

import com.scit.model.User;

public interface UserService {
	void save(User user);

	User getUserByid(long id);
}
