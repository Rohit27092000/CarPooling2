package com.app.Repository.CarOwner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.CarOwner;

@Repository
public interface CarOwnerRepository extends JpaRepository<CarOwner, Integer> 
{
	CarOwner findByUserId(int userId);
}
