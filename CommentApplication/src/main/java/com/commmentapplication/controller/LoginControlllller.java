package com.commmentapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.commmentapplication.dto.Userdto;
import com.commmentapplication.model.User;
import com.commmentapplication.service.UserService;

@Controller
public class LoginControlllller {
	
	

	@Autowired
	private UserService userService;
	
	@ModelAttribute("Comment")
	public String saveComment() {
		Userdto userdto = new Userdto();
		return userdto.getComment();
	}
	
	 @GetMapping("/login")
	    public String login() {
	        return "login";
	    }

	 
	 @GetMapping("/forgetpassword")
	    public String forgetpassword() {
	        return "forgetpassword";
	    }
	 
	 
	 
	 
	 @GetMapping("/home")
	    public String home() {
	        return "home";
	    }
	 
	 
	 
	 @PostMapping("/home")
	    public String saveComment(@ModelAttribute ("Comment") String Comment) {
		 userService.save(Comment);
	        return "home";
	    }
	 
	 
	 
	 
	 
	 
}
