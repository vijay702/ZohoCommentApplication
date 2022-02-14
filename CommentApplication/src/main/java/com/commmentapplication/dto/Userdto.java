package com.commmentapplication.dto;

public class Userdto {
	
	private String emailId;
	
	private String password;
	
	private String secretCode;
	
	private String Comment;

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
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
		return "Userdto [emailId=" + emailId + ", password=" + password + ", secretCode=" + secretCode + "]";
	}

	public Userdto() {
		
	}

	public Userdto(String emailId, String password, String secretCode) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.secretCode = secretCode;
		
	}
	
	
	public Userdto(String Comment) {
		super();
	
		this.Comment=Comment;
	}
}
