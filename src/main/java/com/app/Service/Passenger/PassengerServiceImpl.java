package com.app.Service.Passenger;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.Entity.Passenger;
import com.app.Repository.Passenger.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;
	
	
	@Override
	public Passenger getbyId(int theId) {
		// TODO Auto-generated method stub
		Optional<Passenger> p = passengerRepository.findById(theId);
		Passenger pass = p.get();
		return pass;
	}


	@Override
	public Passenger getByUserId(int userId) {
		// TODO Auto-generated method stub
		Passenger p = passengerRepository.findByUserId(userId);
		return p;
	}


	@Override
	public String addPassenger(Passenger thePassenger) {
		// TODO Auto-generated method stub
			passengerRepository.save(thePassenger);
		return "Success";
	}

	
	

}
