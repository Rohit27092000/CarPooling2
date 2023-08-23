package com.app.Service.PassengerRequest;

import com.app.Entity.Passenger;
import com.app.Entity.PassengerRequest;

public interface PassengerRequestService {

	public PassengerRequest getRequestByPassenger(Passenger passenger);
	
	public String addPassengerRequest(PassengerRequest thePassengerRequest);
}
