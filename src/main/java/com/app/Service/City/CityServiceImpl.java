package com.app.Service.City;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.City;
import com.app.Repository.City.CityRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public List<City> getAllCities() {
		// TODO Auto-generated method stub
		List<City> city = cityRepository.findAll();
		return  city;
	}
	
	
	@Override
	public City getById(int theCityId) {
		// TODO Auto-generated method stub
		Optional<City> c = cityRepository.findById(theCityId); 
		City city = c.get();
		return city;
	}

	@Override
	public String addCity(City theCity) {
		// TODO Auto-generated method stub
		cityRepository.save(theCity);
		return "Success "+theCity.getCityName();
	}


	@Override
	public City getByCityName(String theCity) {
		// TODO Auto-generated method stub
		return cityRepository.getByCityName(theCity);
	}

}
