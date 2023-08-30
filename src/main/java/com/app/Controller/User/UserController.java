package com.app.Controller.User;

import java.io.Serializable;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	/*API to register users*/
	@PostMapping("/registerUsers")
	public String RegisterUser(@RequestBody @Valid User theUser,BindingResult result)
	{
		if(result.hasErrors())
		{
			return result.toString();
		
		}
		else {
			theUser.setId(0);
			System.out.println(theUser.toString());
			userService.RegisterUser(theUser);
			return "successfully Register"+theUser.getFirstName();	
		}
	}
	/*API to Login users using EmailId and Password */
	@PostMapping("/loginUser")
	public User submitUser(@RequestBody @Valid User user , BindingResult result) throws CustomException
	{
		System.out.println(user.toString());
		User u = null;
		
		
		if(result.hasErrors()){
			//return null;
	
		}else{
			u= userService.validateUser(user.getEmail(), user.getPassword());
		}
		
		System.out.println(u);
		
		if(u==null)
		{
			throw new CustomException("Wrong EmailId and Password");
			//return null;
		}
		else
		{
			return u;
		}
	}
	
	@PatchMapping("/UpdateUser")
	public User updateUser(@RequestBody User theUser)
	{
		User u = userService.updateUser(theUser);
		return u;	
	}
	
	public class CustomException extends Exception implements Serializable{
		
		public CustomException(String errorMessage) {
			super(errorMessage); 
		}
		
	}
}
