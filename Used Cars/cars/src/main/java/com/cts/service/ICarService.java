package com.cts.service;

import java.util.List;
import java.util.Optional;

import com.cts.model.CarDetails;

public interface ICarService {

	
	public List<CarDetails> getAllCar();	
	public void saveCars(CarDetails car);
	
}
