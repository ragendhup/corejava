
package com.tns.fooddeliverysystem.entities;

public class User {
	//Fields
	private int userId;
	private String username;
	private long contactNo;
	
	public User(int userId,String username,long contactNo) {
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", contactNo=" + contactNo + "]";
	}
}
