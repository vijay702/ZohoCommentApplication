package com.commmentapplication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String emailId;
	
	private String password;
	
	private String secretCode;
	
	private String Comment;

	public User( String emailId, String password, String secretCode ) {
		
		
		this.emailId = emailId;
		this.password = password;
		this.secretCode = secretCode;
		
	}
	
public User( String Comment ) {
		
	
		this.Comment = Comment;
		
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", password=" + password + ", secretCode=" + secretCode
				+ "]";
	}
	
	public User() {
		
		
	}

}
