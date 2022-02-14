package com.commmentapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.commmentapplication.dto.Userdto;
import com.commmentapplication.model.User;
import com.commmentapplication.service.UserService;

@Controller
@RequestMapping("/signup")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public Userdto userdto() {
		
		return new Userdto();
	}
	
	
	@GetMapping
	public String showRegistration() {
	
		return "signup";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute ("user") Userdto userdto) {
		
		userService.save(userdto);
		return "login";
		
	}
	
	
	


	
	
	

}
