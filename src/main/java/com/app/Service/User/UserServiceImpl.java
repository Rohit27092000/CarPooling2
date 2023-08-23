package com.app.Service.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.User;
import com.app.Repository.User.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findById(int userId) {
		// TODO Auto-generated method stub
		Optional<User> u = userRepository.findById(userId);
		User user = u.get();
		return user;
	}

	@Override
	public String RegisterUser(User theUser) {
		// TODO Auto-generated method stub
		userRepository.save(theUser);
		return "Success";
	}

	@Override
	public User validateUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User theUser) {
		
		User user = userRepository.save(theUser);
		return user;
	}

}
