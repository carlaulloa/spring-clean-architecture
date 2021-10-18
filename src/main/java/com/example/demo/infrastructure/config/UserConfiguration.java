package com.example.demo.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.application.repository.UserRepository;
import com.example.demo.application.usecase.UserUsecase;
import com.example.demo.application.usecase.UserUsecaseImpl;
import com.example.demo.infrastructure.persistence.UserRepositoryInMemoryImpl;

@Configuration
public class UserConfiguration {

	@Bean
	public UserRepository createUserRepository() {
		return new UserRepositoryInMemoryImpl();
	}
	
	@Bean
	public UserUsecase createUserUsecase() {
		return new UserUsecaseImpl(createUserRepository());
	}
	
}
