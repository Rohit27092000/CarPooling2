package com.app.Service.Trip;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.CarOwner;
import com.app.Entity.City;
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

	@Override
	 public List<Trip> getTripsByCriteria(City sourceCity, City destinationCity, LocalDate tripDate) 
	{
        return tripRepository.findBySourceCityAndDestinationCityAndTripDate(sourceCity, destinationCity, tripDate);
	}

	/*
	 * @Override public List<Trip> getTripByCity(int sourceCityId, int
	 * destinationCityId, LocalDate date) { // TODO Auto-generated method stub
	 * return tripRepository.getTripBysourceCitydestinationCity(sourceCityId,
	 * destinationCityId, date); }
	 */

}
