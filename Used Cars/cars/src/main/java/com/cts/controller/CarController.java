package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.CarDetails;
import com.cts.service.ICarService;
	

@RestController
public class CarController {
	
	@Autowired
	ICarService carService;
	
	@GetMapping("/cars")
	public List<CarDetails> getCars(){
		return carService.getAllCar();
	}
	
	@PostMapping("/car")
	public void insertCar(@RequestBody CarDetails car) {
		carService.saveCars(car);
	}
	
}