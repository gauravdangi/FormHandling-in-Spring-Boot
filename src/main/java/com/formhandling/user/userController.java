package com.formhandling.user;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {
	@Autowired
	private userService service;
	@RequestMapping("/getuser")
	public String getUserPageDirect() {
		return "userForm";
	}
	@RequestMapping(method = RequestMethod.POST, value="/register")
	public String registerUser(@RequestParam("name") String name,
			@RequestParam("username") String username,
			@RequestParam(value="dob", required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dob) {
		User user = new User(name,username,dob);
		service.addUser(user);
		//after registering, redirect user to main page
		return "index.html";
	}
}
