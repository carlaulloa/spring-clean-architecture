package com.example.demo.infrastructure.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.usecase.UserUsecase;
import com.example.demo.domain.User;

@RestController
public class UserRestController {

	private final UserUsecase userUsecase;
	
	public UserRestController(UserUsecase userUsecase) {
		this.userUsecase = userUsecase;
	}
	
	@GetMapping("/users")
	public List<User> getAll(){
		return this.userUsecase.getAll();
	}
	
	@PostMapping("/users")
	public User insert(@RequestBody User user) {
		return this.userUsecase.insert(user);
	}
}
