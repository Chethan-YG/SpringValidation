package com.springboot.validation.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class loginData {
	
	@NotBlank(message="Username cannot be empty.")
	@Size(min=3, max=20, message="Username must be 3 to 12 characters long.")
	private String userName;
	

	@Email
	@NotBlank(message="Email cannot be empty")
	private String email;
	
	@Size(min=7, max=20, message="Password must be 7 to 12 characters long.")
	@NotBlank(message="Password cannot be empty")
	private String password;
	
	@AssertTrue(message="must agree term and conditions")
	private boolean agreed;
	
	public loginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public loginData(String userName, String email,String password,boolean agreed) {
		super();
		this.userName = userName;
		this.email = email;
		this.password=password;
		this.agreed=agreed;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isAgreed() {
		return agreed;
	}


	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}


	@Override
	public String toString() {
		return "loginData [userName=" + userName + ", email=" + email + ", Password=" + password + ", agreed=" + agreed
				+ "]";
	}


	public String getRole() {
		return null;
	}

}
