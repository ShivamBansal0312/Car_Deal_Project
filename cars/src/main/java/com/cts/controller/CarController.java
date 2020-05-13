package com.cts.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.cts.Exception.CarModelNotFoundException;
import com.cts.model.CarDetails;
import com.cts.model.CarDetailsDto;
import com.cts.service.ICarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	ICarService carService;

	@GetMapping("/")
	public List<CarDetails> getCars() {
		return carService.getAllCars();
	}

	
	@GetMapping("/user/{userId}")
	public List<CarDetails> findCarByUserId(@PathVariable Long userId) {
		return carService.findCarByUserId(userId);
	}

	@PostMapping("/car")
	public void addNewCar(@Valid @RequestBody CarDetailsDto car) {
		carService.createCar(car);
	}

	@PutMapping("/update/{carId}")
	public ResponseEntity<CarDetails> updatecar(@PathVariable("carId") Long carId, @Valid @RequestBody CarDetails car) {
		CarDetails oldCar = carService.findCarByCarId(carId);

		if (oldCar != null) {
			CarDetails updatedCar = carService.updateCar(carId, oldCar);
			return new ResponseEntity<CarDetails>(updatedCar, HttpStatus.OK);
		} else {
			throw new CarModelNotFoundException();
		}
	}

	@DeleteMapping("/delete/{carId}")
	public ResponseEntity<Object> deleteCar(@PathVariable("carId") Long carId) {
		return new ResponseEntity<>(carService.deleteCar(carId), HttpStatus.OK);
	}
}