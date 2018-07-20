package com.formhandling.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
	@Autowired
	private UserRepository userRepo;
	
	public void addUser(User user) {
		userRepo.save(user);
	}
}
