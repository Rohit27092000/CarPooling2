package com.app.Service.CarService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Car;
import com.app.Entity.CarOwner;
import com.app.Repository.Car.CarRepository;

@Service
public class CarserviceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public Car getById(int theId) {
		// TODO Auto-generated method stub
		Optional<Car> c = carRepository.findById(theId);
		Car car = c.get();
		return car;
	}

	@Override
	public List<Car> getCarByCarOwner(CarOwner theCarOwner) {
		// TODO Auto-generated method stub
		List<Car> car = carRepository.findByCarOwner(theCarOwner);
		return car;
	}

	

}
