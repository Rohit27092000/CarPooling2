package com.app.Service.Trip;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.CarOwner;
import com.app.Entity.Trip;
import com.app.Repository.Trip.TripRepository;

@Service
public class TripServiceImpl implements TripService{

	@Autowired
	private TripRepository tripRepository;

	@Override
	public Trip getTripById(int theTripId) {
		// TODO Auto-generated method stub
		Optional<Trip> t = tripRepository.findById(theTripId);
			Trip theTrip = t.get();
		return theTrip;
	}

	@Override
	public Trip getTripByCarOwner(CarOwner theCarOwner) {
		// TODO Auto-generated method stub
		Trip theTrip =  tripRepository.getTripByCarOwner(theCarOwner);
		return theTrip;
	}

	@Override
	public String addTrip(Trip theTrip) {
		// TODO Auto-generated method stub
			tripRepository.save(theTrip);
		return "Success";
	}


}
