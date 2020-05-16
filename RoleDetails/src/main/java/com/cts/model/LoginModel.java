package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Entity
@Table(name = "role_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NonNull
public class LoginModel {

	@Id
	private Long userId;
	private String password;
	private String userType;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "LoginModel [userId=" + userId + ", password=" + password + ", userType=" + userType + ", getUserId()="
				+ getUserId() + ", getPassword()=" + getPassword() + ", getUserType()=" + getUserType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public LoginModel(Long userId, String password, String userType) {
		super();
		this.userId = userId;
		this.password = password;
		this.userType = userType;
	}
	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
