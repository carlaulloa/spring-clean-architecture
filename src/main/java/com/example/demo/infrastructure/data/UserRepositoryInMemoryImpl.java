package com.example.demo.infrastructure.data;

import java.util.Arrays;
import java.util.List;

import com.example.demo.application.ports.UserRepository;
import com.example.demo.domain.User;

public class UserRepositoryInMemoryImpl implements UserRepository {

	@Override
	public List<User> getAll() {
		return Arrays.asList(new User[] {
			new User("1", "user1", "user1@example.com")
		});
	}

	@Override
	public User insert(User user) {
		return user;
	}

}
