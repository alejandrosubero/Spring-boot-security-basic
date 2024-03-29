package com.sprintbasic.sprinbasic.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sprintbasic.sprinbasic.entitys.MyUserDetails;
import com.sprintbasic.sprinbasic.entitys.User;
import com.sprintbasic.sprinbasic.reposity.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
	Optional <User> user= userRepository.findByuserName(userName);
	
	user.orElseThrow(()->new UsernameNotFoundException ("no found: " + userName));
		
		return user.map(MyUserDetails::new).get();
		
		
	}

}
