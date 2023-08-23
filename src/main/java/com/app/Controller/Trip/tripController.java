package com.app.Controller.Trip;

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
import com.app.Entity.City;
import com.app.Entity.Trip;
import com.app.Service.CarOwner.CarOwnerService;
import com.app.Service.CarService.CarService;
import com.app.Service.City.CityService;
import com.app.Service.Trip.TripService;



@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/trips")
public class tripController {

	@Autowired
	private TripService tripService;
	@Autowired
	private CarOwnerService carOwnerService;
	@Autowired
	private CarService carService;
	@Autowired
	private CityService cityService;
	
	@GetMapping("/getTripById/{theTripId}")
	public Trip getTripById(@PathVariable int theTripId)
	{
		Trip trip = tripService.getTripById(theTripId);
		return trip;
		
	}
	
	@GetMapping("/getTripByCarOwnerId/{CarOwnerId}")
	public Trip getTripByCarOwnerId(@PathVariable int CarOwnerId)
	{
		CarOwner c = new CarOwner();
		c.setCarOwnerId(CarOwnerId);
		
		Trip theTrip = tripService.getTripByCarOwner(c) ; 
				return theTrip;
	}
	
	@PostMapping("/addTrip")
	public String AddTrip(@RequestBody Trip theTrip)
	{
		System.out.println(theTrip.toString()+"-->>>");
		CarOwner carOwner = carOwnerService.getbyId(theTrip.getCarOwner().getCarOwnerId());
		Car car = carService.getById(theTrip.getCar().getCar_Id());
		City sourceCity = cityService.getById(theTrip.getSourceCity().getCity_Id());
		City destinationCity = cityService.getById(theTrip.getDestinationCity().getCity_Id());
		
		theTrip.setSourceCity(sourceCity);
		theTrip.setDestinationCity(destinationCity);
		theTrip.setCarOwner(carOwner);
		theTrip.setCar(car);
		System.out.println(theTrip.toString());
		return tripService.addTrip(theTrip);
	}
}
