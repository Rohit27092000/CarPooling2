package com.app.Service.Trip;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.app.Entity.CarOwner;
import com.app.Entity.City;
import com.app.Entity.Trip;

public interface TripService {

	public Trip getTripById(int theTripId);
	
	public Trip getTripByCarOwner(CarOwner theCarOwner); 

	public String addTrip(Trip theTrip);

	/*
	 * public List<Trip> getTripByCity(int sourceCityId , int destinationCityId,
	 * LocalDate date);
	 */
	public List<Trip> getTripsByCriteria(City sourceCity, City destinationCity, LocalDate tripDate);
	
}
