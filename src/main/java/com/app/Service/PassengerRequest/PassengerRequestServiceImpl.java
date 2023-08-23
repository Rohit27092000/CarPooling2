package com.app.Service.PassengerRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Passenger;
import com.app.Entity.PassengerRequest;
import com.app.Repository.PassengerRequest.PassengerRequestRepository;

@Service
public class PassengerRequestServiceImpl implements PassengerRequestService {

	@Autowired
	private PassengerRequestRepository passengerRequestRepository;
	
	@Override
	public PassengerRequest getRequestByPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return passengerRequestRepository.findPassengerRequestByPassenger(passenger);
	}

	@Override
	public String addPassengerRequest(PassengerRequest thePassengerRequest) {
		// TODO Auto-generated method stub
		passengerRequestRepository.save(thePassengerRequest);
		return "success";
	}

	
}
