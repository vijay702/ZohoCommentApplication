package com.commmentapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.commmentapplication.model.User;
import com.commmentapplication.repository.UserRepository;
@Service
public class CustomUserDetailService implements UserDetailsService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByEmailId(username);
		
		if(user==null) {
			
			throw new UsernameNotFoundException("User Not Found ");
		}
				
				
		return new CustomUserDetails(user);
	}

	}


