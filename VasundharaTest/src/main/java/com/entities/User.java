package com.entities;

public class User {

	private String UserId;
	private String password;
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String password) {
		super();
		UserId = userId;
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UserId == null) ? 0 : UserId.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", password=" + password + "]";
	}
	
	
	
	
	
	
	


}
