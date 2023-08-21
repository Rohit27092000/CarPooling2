package com.app.Controller.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Passenger;
import com.app.Entity.User;
import com.app.Service.Passenger.PassengerService;
import com.app.Service.User.UserService;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

	@Autowired
	private PassengerService passengerService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getPassenger/{passId}")
	public Passenger getById(@PathVariable int passId)
	{
		Passenger p= passengerService.getbyId(passId);
		return p;
	}
	
	@GetMapping("/getPassByUserId/{userId}")
	 public Passenger getByUserId(@PathVariable int userId) 
	 { 
		 Passenger p = passengerService.getByUserId(userId);
		 return p;
	 }
	 
	@PostMapping("/addPassengers")
	public String addPassenger(@RequestBody Passenger thePassenger)
	{
		System.out.println(thePassenger.toString());
		int userId = thePassenger.getUser().getId();
		User theUser = userService.findById(userId);
		thePassenger.setUser(theUser);
		
		thePassenger.setPassenger_Id(0);
		
		
		return passengerService.addPassenger(thePassenger);
		
	}
}
