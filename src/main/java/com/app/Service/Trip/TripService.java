package com.app.Service.Trip;

import com.app.Entity.CarOwner;
import com.app.Entity.Trip;

public interface TripService {

	public Trip getTripById(int theTripId);
	
	public Trip getTripByCarOwner(CarOwner theCarOwner); 

	public String addTrip(Trip theTrip);
}
