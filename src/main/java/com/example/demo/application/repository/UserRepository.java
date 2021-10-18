package com.example.demo.application.repository;

import java.util.List;

import com.example.demo.domain.User;

public interface UserRepository {

	List<User> getAll();
	
	User insert(User user);
	
}
