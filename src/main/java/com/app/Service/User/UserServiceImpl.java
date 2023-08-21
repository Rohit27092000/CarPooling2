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

}
