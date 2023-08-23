package com.app.Repository.Trip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.CarOwner;
import com.app.Entity.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {

	public Trip getTripByCarOwner(CarOwner theCarOwner);
	
}
