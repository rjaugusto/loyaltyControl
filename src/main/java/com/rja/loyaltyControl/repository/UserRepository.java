package com.rja.loyaltyControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rja.loyaltyControl.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
