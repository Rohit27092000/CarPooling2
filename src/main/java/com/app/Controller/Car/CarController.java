package com.app.Controller.Car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Car;
import com.app.Entity.CarOwner;
import com.app.Service.CarOwner.CarOwnerService;
import com.app.Service.CarService.CarService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
    private CarService carService;
	
	@Autowired
	private CarOwnerService carOwnerService;
	
	@GetMapping("/getCarById/{theCarId}")
	public Car getCarById(@PathVariable int theCarId)
	{
		return carService.getById(theCarId);
	}
	
	@GetMapping("/getByCarOwnerId/{theCarOwnerId}")
	public List<Car> getCarByCarOwnerId(@PathVariable int theCarOwnerId)
	{
		CarOwner carOwner = new CarOwner();
		carOwner.setCarOwnerId(theCarOwnerId);
		List<Car> cars = carService.getCarByCarOwner(carOwner);
		return cars;
	}
	
	@PostMapping("/addCars")
	public String addCar(@RequestBody Car theCar)
	{
		CarOwner carOwner = new CarOwner();
	  carOwner = carOwnerService.getbyId(theCar.getCarOwner().getCarOwnerId());
	  theCar.setCarOwner(carOwner);
		return carService.addCar(theCar);
		
	}
}
