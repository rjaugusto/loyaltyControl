package com.rja.loyaltyControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rja.loyaltyControl.controller.UserController;
import com.rja.loyaltyControl.model.User;

@SpringBootApplication
public class LoyaltyControlApplication implements CommandLineRunner {
	
	@Autowired
	UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(LoyaltyControlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Rafael");
		userController.inclui(user);
		
	}

}
