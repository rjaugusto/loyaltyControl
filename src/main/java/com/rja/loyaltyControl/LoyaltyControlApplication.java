package com.rja.loyaltyControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rja.loyaltyControl.controller.UserController;

@SpringBootApplication
public class LoyaltyControlApplication{
	
	@Autowired
	UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(LoyaltyControlApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args ->{
			System.out.println("Rafael De Jesus Augusto");
		};
		
	}
}
