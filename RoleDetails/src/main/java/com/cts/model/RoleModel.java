package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class RoleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	private Long userId;
	private String password;
	private String userType;
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
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
		return "RoleModel [roleId=" + roleId + ", userId=" + userId + ", password=" + password + ", userType="
				+ userType + ", getRoleId()=" + getRoleId() + ", getUserId()=" + getUserId() + ", getPassword()="
				+ getPassword() + ", getUserType()=" + getUserType() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public RoleModel(Long roleId, Long userId, String password, String userType) {
		super();
		this.roleId = roleId;
		this.userId = userId;
		this.password = password;
		this.userType = userType;
	}
	public RoleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
