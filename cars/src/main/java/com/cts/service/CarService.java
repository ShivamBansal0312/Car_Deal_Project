package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Exception.CarServiceException;
import com.cts.model.CarDetails;
import com.cts.model.CarDetailsDto;
import com.cts.repository.CarRepository;

@Service
@Transactional
public class CarService implements ICarService {

	@Autowired
	CarRepository carRepository;

	public List<CarDetails> getAllCars() {
		List<CarDetails> carList;
		try {
			carList = (List<CarDetails>) carRepository.findAll();

		} catch (CarServiceException ex) {
			throw new CarServiceException("Car Service is temporarily unavailable");
		}
		return carList;
	}

	public CarDetailsDto createCar(CarDetailsDto car) {
		ModelMapper maper = new ModelMapper();
		maper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		CarDetails carr = maper.map(car, CarDetails.class);
		carRepository.save(carr);
		return null;
	}

	public CarDetails findCarByCarId(Long carId) {
		return carRepository.findById(carId).get();
	}

	@Override
	public CarDetails updateCar(Long carId, CarDetails car) {
		CarDetails existingCar = carRepository.findById(carId).get();
		existingCar.setUserId(car.getUserId());
		existingCar.setSeaterType(car.getSeaterType());
		existingCar.setCarNumber(car.getCarNumber());
		existingCar.setYearOfPurchase(car.getYearOfPurchase());
		existingCar.setDistanceTravelled(car.getDistanceTravelled());
		existingCar.setAmount(car.getAmount());
		existingCar.setCarType(car.getCarType());
		existingCar.setBrand(car.getBrand());

		CarDetails updatedCar = carRepository.save(existingCar);
		return updatedCar;
	}

	@Override
	public String deleteCar(Long carId) {
		carRepository.deleteById(carId);
		return "Car Model id with " + carId + " is deleted";
	}

	public List<CarDetails> findCarByUserId(Long userId) {
		return carRepository.findByUserId(userId);
	}
}