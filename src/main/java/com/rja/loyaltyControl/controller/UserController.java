package com.rja.loyaltyControl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rja.loyaltyControl.model.User;
import com.rja.loyaltyControl.repository.UserRepository;

@RestController
@RequestMapping(path = "user")
public class UserController {
			
	@Autowired
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@PostMapping
	public void inclui(User user) {
		userRepository.save(user);
	}
	
	
}
