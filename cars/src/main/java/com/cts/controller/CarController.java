package com.cts.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.cts.Exception.CarModelNotFoundException;
import com.cts.model.CarDetails;
import com.cts.model.CarDetailsDto;
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
	public void insertCar(@Valid @RequestBody CarDetailsDto car) {
		carService.createCar(car);
	}
	
	@PutMapping("/update/{carId}")
	public ResponseEntity<Object> updatecar(@PathVariable("carId") Long carId,@Valid @RequestBody CarDetails car) {
	      
	     // carService.updatecar(carId, car);
	     // return new ResponseEntity<>(carService.updatecar(carId, car), HttpStatus.OK);
		Optional<CarDetails> optional=carService.get(carId);
		
	if(optional.isPresent())
		{
			carService.updatecar(carId, car);
			return new ResponseEntity<>(carService.updatecar(carId, car), HttpStatus.OK);
		}
		else 
		{
			throw new CarModelNotFoundException();
		}
		
		
		
//		try {
//			if(optional.isPresent())
//				{
//					carService.updatecar(carId, car);
//					return new ResponseEntity<>(carService.updatecar(carId, car), HttpStatus.OK);
//				}
//		} catch (SQLException sqle) {
//		    throw new CarModelNotFoundException();
//		}
		
		
		
		
		
	 }
	
//	@GetMapping(path="/findById/{carId}")
//	public CarDetails get(@PathVariable Long carId) {
//		return carService.findById(carId);
//	}

	@GetMapping(path="/allCarWithUserId/{userId}")
	public List<CarDetails> get(@PathVariable int userId) {
		return carService.findById(userId);
	}
	
	 
	@DeleteMapping("/delete/{carId}")
	public ResponseEntity<Object> deletecar(@PathVariable("carId") Long carId) {
	      
	      return new ResponseEntity<>(carService.deletecar(carId), HttpStatus.OK);
	   }
	  
	
}