package com.app.Service.Passenger;

import com.app.Entity.Passenger;

public interface PassengerService {

	public Passenger getbyId(int theId);
	
	public Passenger getByUserId( int userId);

	public String addPassenger(Passenger thePassenger);
}
