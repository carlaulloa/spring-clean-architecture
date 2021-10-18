package com.example.demo.application.usecase;

import java.util.List;

import com.example.demo.application.repository.UserRepository;
import com.example.demo.domain.User;

public class UserUsecaseImpl implements UserUsecase {

	private final UserRepository userRepository;
	
	public UserUsecaseImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public List<User> getAll() {
		return this.userRepository.getAll();
	}

	@Override
	public User insert(User user) {
		return this.userRepository.insert(user);
	}

}
