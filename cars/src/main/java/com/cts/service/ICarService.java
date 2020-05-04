package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.cts.model.CarDetails;

public interface ICarService {

	
	public List<CarDetails> getAllCar();	
	public void saveCars(CarDetails car);
	public String updatecar(Long carId, CarDetails car);

	public String deletecar(Long carId);
	
	public CarDetails findById(Long carId);
}
