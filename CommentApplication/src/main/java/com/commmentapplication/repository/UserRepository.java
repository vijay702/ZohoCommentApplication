package com.commmentapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commmentapplication.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{


	
	 User findByEmailId(String email);
	

}
