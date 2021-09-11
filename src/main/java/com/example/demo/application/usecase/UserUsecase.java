package com.example.demo.application.usecase;

import java.util.List;

import com.example.demo.domain.User;

public interface UserUsecase {

	List<User> getAll();
	
	User insert(User user);
	
}
