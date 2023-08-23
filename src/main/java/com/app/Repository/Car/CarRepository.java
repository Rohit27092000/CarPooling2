package com.app.Repository.Car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Car;
import com.app.Entity.CarOwner;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	public List<Car> findByCarOwner(CarOwner theCarOwner);
}
