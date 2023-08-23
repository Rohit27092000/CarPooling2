package com.app.Controller.City;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.City;
import com.app.Service.City.CityService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping("/getAllCities")
	public List<City> getAllCities()
	{
		
		return cityService.getAllCities();	
	}
	
	@GetMapping("getCitybyId/{cityId}")
	public City getCityById(@PathVariable int cityId)
	{
		return cityService.getById(cityId);
	}
	
	@PostMapping("/addCities")
	public String addCity(@RequestBody City theCity)
	{
		System.out.println(theCity.toString());
		return cityService.addCity(theCity);
	}
}
