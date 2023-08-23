package com.app.Service.Passenger;

import com.app.Entity.Passenger;

public interface PassengerService {

	public Passenger getPassengerbyId(int theId);
	
	public Passenger getPassengerByUserId( int userId);

	public String addPassenger(Passenger thePassenger);
}
