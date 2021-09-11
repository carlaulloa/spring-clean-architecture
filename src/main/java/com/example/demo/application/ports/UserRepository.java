package com.example.demo.application.ports;

import java.util.List;

import com.example.demo.domain.User;

public interface UserRepository {

	List<User> getAll();
	
	User insert(User user);
	
}
