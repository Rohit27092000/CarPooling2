package com.app.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.User;
import com.app.Service.User.UserService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	/*API to get users using userid*/
	
	@GetMapping("/getByUserId/{userId}")
	public User findById(@PathVariable int userId)
	{
		User theUser = userService.findById(userId);
		return theUser;
	}
}
