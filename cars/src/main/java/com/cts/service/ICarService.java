package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.cts.model.CarDetails;
import com.cts.model.CarDetailsDto;

public interface ICarService {

	
	public List<CarDetails> getAllCars();
	
	//public void saveCars(CarDetails car);
	
	public CarDetails updateCar(Long carId, CarDetails oldCar);
	
	public List<CarDetails> findCarByUserId(Long carId);
	
	public CarDetails findCarByCarId(Long carId);

	public String deleteCar(Long carId);
	
	public CarDetailsDto createCar(CarDetailsDto car);

	//public List<CarDetails> getCarsByCarType(String carType);
}
