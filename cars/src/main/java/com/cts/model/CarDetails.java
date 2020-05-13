package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cardetails")
public class CarDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carId;

	@NotNull(message = "UserId must not be empty")
	@Min(value = 1, message = "UserId must be greater than or equal to 1")
	@Max(value = 1000, message = "UserId must be lower than or equal to 1000")
	private Long userId;
	
	@NotNull(message = "Seater Type must not be empty")
	private Long seaterType;
	
	@JsonIgnore
	@NotEmpty(message = "Car Number must not be empty")
	@Size(min = 2, message = "Name should be of 9 characters")
	private String carNumber;
	
	@NotNull(message = "Year of Purchase must not be empty")
	private Long yearOfPurchase;
	
	@NotNull(message = "Distance Travelled must not be empty")
	private Long distanceTravelled;
	
	@NotNull(message = "Amount must not be empty")
	private Long amount;
	
	@NotEmpty(message = "Car type must not be empty")
	private String carType;
	
	@NotEmpty(message = "Brand must not be empty")
	private String brand;

	@Override
	public String toString() {
		return "CarDetails [carId=" + carId + ", userId=" + userId + ", seaterType=" + seaterType + ", carNumber="
				+ carNumber + ", yearOfPurchase=" + yearOfPurchase + ", distanceTravelled=" + distanceTravelled
				+ ", amount=" + amount + ", carType=" + carType + ", brand=" + brand + "]";
	}
}