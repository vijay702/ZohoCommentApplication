package com.commmentapplication.service;

import com.commmentapplication.dto.Userdto;
import com.commmentapplication.model.User;

public interface UserService {
	
	
	User save(Userdto userdto);
	
	User save(String Comment);

}
