package com.app.Service.City;

import java.util.List;

import com.app.Entity.City;

public interface CityService {

	public List<City> getAllCities();
	
	public City getById(int theCityId);
	
	public String addCity(City theCity);
}
