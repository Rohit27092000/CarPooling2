package com.app.Repository.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

  public Passenger findByUserId(int userId);

	
	 
}
