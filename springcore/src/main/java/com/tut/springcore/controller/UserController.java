package com.tut.springcore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.tut.springcore.dto.AadharUser;
import com.tut.springcore.service.UserService;

@EnableWebMvc
@RestController
@RequestMapping(name="/users/*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(name="/getusers")
	public @ResponseBody List<AadharUser> getUsers()
	{
		return (List<AadharUser>) userService.getUsers();
	}
	
	@PostMapping(value = "/saveUserDetails")
	public void saveUserDetails(@RequestBody AadharUser user) {
		userService.saveUser(user);
	}

}
