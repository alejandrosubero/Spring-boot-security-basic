package com.sprintbasic.sprinbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sprintbasic.sprinbasic.reposity.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SprinbasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinbasicApplication.class, args);
	}

}
