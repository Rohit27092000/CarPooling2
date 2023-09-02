package com.app.Controller.PassengerRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.City;
import com.app.Entity.Passenger;
import com.app.Entity.PassengerRequest;
import com.app.Entity.Trip;
import com.app.Service.City.CityService;
import com.app.Service.Passenger.PassengerService;
import com.app.Service.PassengerRequest.PassengerRequestService;
import com.app.Service.Trip.TripService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/passengers")
public class PassengerRequestController {

	@Autowired
	private PassengerRequestService passengerRequestService;
	
	@Autowired
	private TripService tripService;
	@Autowired
	private PassengerService passengerService;
	@Autowired
	private CityService cityService;

	
	@GetMapping("/getRequestByPassenger/{passengerId}")
	public PassengerRequest getRequestByPassengerId(@PathVariable int passengerId)
	{
		Passenger p = new Passenger();
		p.setPassenger_Id(passengerId);
		return passengerRequestService.getRequestByPassenger(p);
	}
	
	@PostMapping("/addPassengerRequest")
	public String addPassengerRequest(@RequestBody PassengerRequest thePassengerRequest)
	{
		Trip trip = tripService.getTripById(thePassengerRequest.getTrip().getTrip_Id());
		Passenger passenger = passengerService.getPassengerbyId(thePassengerRequest.getPassenger().getPassenger_Id());
		City city = cityService.getById(thePassengerRequest.getCity().getCity_Id());
		
		thePassengerRequest.setTrip(trip);
		thePassengerRequest.setPassenger(passenger);
		thePassengerRequest.setCity(city);
		
		return passengerRequestService.addPassengerRequest(thePassengerRequest);
	}
	
	
}
