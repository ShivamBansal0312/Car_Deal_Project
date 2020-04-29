package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.model.CarDetails;
import com.cts.repository.CarRepository;

@Service
@Transactional
public class CarService implements ICarService
{
    
	@Autowired
	CarRepository carRepository;
	
	public List<CarDetails> getAllCar(){
		return (List<CarDetails>) carRepository.findAll();
	}
	
	public void saveCars(CarDetails car) {
		carRepository.save(car);
	}
	
}