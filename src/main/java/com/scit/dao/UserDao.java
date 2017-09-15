package com.scit.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.scit.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
}
