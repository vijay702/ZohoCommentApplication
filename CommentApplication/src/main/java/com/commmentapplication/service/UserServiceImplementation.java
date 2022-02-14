package com.commmentapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commmentapplication.dto.Userdto;
import com.commmentapplication.model.User;
import com.commmentapplication.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userepo;
	

	


	@Override
	public User save(Userdto userdto) {
		// TODO Auto-generated method stub
		User user = new User( userdto.getEmailId(),userdto.getPassword(),userdto.getSecretCode());
		return userepo.save(user);
	}




	@Override
	public User save(String Comment) {
		Userdto userdto = new Userdto();
		User user = new User(userdto.getComment());
		
		return userepo.save(user)  ;
	}

}
