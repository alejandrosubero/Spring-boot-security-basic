package com.sprintbasic.sprinbasic.reposity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintbasic.sprinbasic.entitys.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByuserName(String userName);

}
