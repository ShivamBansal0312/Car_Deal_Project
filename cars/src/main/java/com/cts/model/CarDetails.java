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

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;

@Entity
@Table(name = "cardetails")

public class CarDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
	// @NotEmpty(message = "UserId must not be empty")
	// @Min(value = 1, message = "UserId must be greater than or equal to 1") 
    // @Max(value = 1000, message = "UserId must be lower than or equal to 1000") 
	private Long userId;
	 //@NotEmpty(message = "Seater Type must not be empty")
    private Long seaterType;
	 //@NotEmpty(message = "Car Number must not be empty")
    @Size(min=2,message="Name should be of 9 characters")
    private String carNumber;
	 //@NotEmpty(message = "Year of Purchase must not be empty")
    @Past
	@ApiModelProperty(notes="Year of Purchase should be in past")
    private Long yearOfPurchase;
	// @NotEmpty(message = "Distance Trvelled must not be empty")
    private Long distanceTravelled;
	// @NotEmpty(message = "Amount must not be empty")
    private Long amount;
	// @NotEmpty(message = "Car type must not be empty")
    private String carType;
	 //@NotEmpty(message = "Brand must not be empty")
    private String brand;
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getSeaterType() {
		return seaterType;
	}
	public void setSeaterType(Long seaterType) {
		this.seaterType = seaterType;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public Long getYearOfPurchase() {
		return yearOfPurchase;
	}
	public void setYearOfPurchase(Long yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}
	public Long getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(Long distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "CarDetails [carId=" + carId + ", userId=" + userId + ", seaterType=" + seaterType + ", carNumber="
				+ carNumber + ", yearOfPurchase=" + yearOfPurchase + ", distanceTravelled=" + distanceTravelled
				+ ", amount=" + amount + ", carType=" + carType + ", brand=" + brand + "]";
	}
	public CarDetails(Long carId, Long userId, Long seaterType, String carNumber, Long yearOfPurchase,
			Long distanceTravelled, Long amount, String carType, String brand) {
		super();
		this.carId = carId;
		this.userId = userId;
		this.seaterType = seaterType;
		this.carNumber = carNumber;
		this.yearOfPurchase = yearOfPurchase;
		this.distanceTravelled = distanceTravelled;
		this.amount = amount;
		this.carType = carType;
		this.brand = brand;
	}
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}