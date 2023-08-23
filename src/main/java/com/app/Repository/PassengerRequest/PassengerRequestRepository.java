package com.app.Repository.PassengerRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Passenger;
import com.app.Entity.PassengerRequest;

@Repository
public interface PassengerRequestRepository extends JpaRepository<PassengerRequest, Integer>{

	public PassengerRequest findPassengerRequestByPassenger(Passenger passengerId);
}
