package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@PutMapping("/update/{carId}")
	public ResponseEntity<Object> updatecar(@PathVariable("carId") Long carId, @RequestBody CarDetails car) {
	      
	      carService.updatecar(carId, car);
	      return new ResponseEntity<>(carService.updatecar(carId, car), HttpStatus.OK);
	 }
	
	@GetMapping(path="/findById/{carId}")
	public CarDetails get(@PathVariable Long carId) {
		return carService.findById(carId);
	}
	
	 
	@DeleteMapping("/delete/{carId}")
	public ResponseEntity<Object> deletecar(@PathVariable("carId") Long carId) {
	      
	      return new ResponseEntity<>(carService.deletecar(carId), HttpStatus.OK);
	   }
	  
	
}