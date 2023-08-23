package com.app.Service.CarService;

import java.util.List;


import com.app.Entity.Car;
import com.app.Entity.CarOwner;

public interface CarService {

	public Car getById(int theId);
	public List<Car> getCarByCarOwner(CarOwner theCarOwner);
}
