package com.cts.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.model.CarDetails;

public interface CarRepository extends CrudRepository<CarDetails, Long>
{

}
