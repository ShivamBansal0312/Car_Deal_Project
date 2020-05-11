package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.cts.model.CarDetails;
import com.cts.model.CarDetailsDto;

public interface ICarService {

	
	public List<CarDetails> getAllCar();	
	//public void saveCars(CarDetails car);
	
	public String updatecar(Long carId, CarDetails car);
	public Optional<CarDetails> get(Long carId);

	public String deletecar(Long carId);
	
	//public CarDetails findById(Long carId);
	
	public CarDetailsDto createCar(CarDetailsDto car);

	public List<CarDetails> findById(int userId);
}
