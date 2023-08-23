package com.app.Service.CarOwner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.CarOwner;
import com.app.Repository.CarOwner.CarOwnerRepository;

@Service
public class CarOwnerServiceImpl implements CarOwnerService {

	@Autowired
	private CarOwnerRepository carOwnerRepository;
	

	@Override
	public CarOwner getbyId(int theId) {
		// TODO Auto-generated method stub
		Optional<CarOwner> c = carOwnerRepository.findById(theId);
		CarOwner carOwner = c.get();
		return carOwner;
	}

	@Override
	public CarOwner getCarOwnerByUserId(int userId) {
		// TODO Auto-generated method stub
		CarOwner carOwner = carOwnerRepository.findByUserId(userId);
		return carOwner;
	}

	@Override
	public String addCarOwner(CarOwner theCarOwner) {
		// TODO Auto-generated method stub
		carOwnerRepository.save(theCarOwner);
		return "Success";
	}

	

}
