package com.app.Service.CarOwner;

import com.app.Entity.CarOwner;

public interface CarOwnerService {

public CarOwner getbyId(int theId);
	
	public CarOwner getCarOwnerByUserId( int userId);

	public String addCarOwner(CarOwner theCarOwner);
}
