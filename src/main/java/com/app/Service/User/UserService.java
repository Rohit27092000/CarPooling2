	package com.app.Service.User;

import com.app.Entity.User;

public interface UserService {
	
	public User findById(int userId);
	
	public String RegisterUser(User theUser);
	
	public User validateUser(String email, String password);
	
	public User updateUser(User theUser);
}
