package com.cts.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCar {
	
	private Long userId;
	private String userName;
	private String email;
	private Long mobileNumber;
	private String city;
	private List<Car> carList;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	@Override
	public String toString() {
		return "UserCar [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", city=" + city + ", carList=" + carList + "]";
	}
	public UserCar(Long userId, String userName, String email, Long mobileNumber, String city, List<Car> carList) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.carList = carList;
	}
	public UserCar() {
		super();
		// TODO Auto-generated constructor stub
	}

}