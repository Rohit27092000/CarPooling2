package com.app.Controller.CarOwner;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.CarOwner;
import com.app.Entity.User;
import com.app.Service.CarOwner.CarOwnerService;
import com.app.Service.User.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/CarOwner")
public class CarOwnerController {

	@Autowired
	private CarOwnerService carOwnerService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getCarOwner/{CarOwnerId}")
	public CarOwner getById(@PathVariable int CarOwnerId)
	{
		
		return carOwnerService.getbyId(CarOwnerId);
	}
	
	@GetMapping("/getCarOwnerByUserId/{userId}")
	 public CarOwner getByUserId(@PathVariable int userId) 
	 { 
		 CarOwner carOwner = carOwnerService.getCarOwnerByUserId(userId);
		 return carOwner;
	 }
	 
	@PostMapping("/addCarOwner")
	public String addCarOwner(@RequestBody @Valid CarOwner theCarOwner,BindingResult result)
	{
		if(result.hasErrors())
		{
			return result.toString();
		}
		else
		{
			System.out.println(theCarOwner.toString());
			int userId = theCarOwner.getUser().getId();
			User theUser = userService.findById(userId);
			
			theCarOwner.setUser(theUser);
			theCarOwner.setCarOwnerId(0);
			return carOwnerService.addCarOwner(theCarOwner);
		}
		
	}
}
