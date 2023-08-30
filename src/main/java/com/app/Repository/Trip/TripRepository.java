package com.app.Repository.Trip;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.Entity.CarOwner;
import com.app.Entity.City;
import com.app.Entity.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {

	public Trip getTripByCarOwner(CarOwner theCarOwner);

	//@Query("FROM Trip t WHERE t.sourceCity=:sourceCity and t.destinationCity=:destinationCity and t.tripDate= date")
	/*
	 * public List<Trip> getTripBysourceCitydestinationCity(int sourceCityId, int
	 * destinationCityId, LocalDate date);
	 */
	List<Trip> findBySourceCityAndDestinationCityAndTripDate(City sourceCity, City destinationCity, LocalDate tripDate);
	
}
