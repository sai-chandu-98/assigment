package com.tut.springcore.service;

import java.util.List;

import com.tut.springcore.dto.AadharUser;
import com.tut.springcore.repository.UserRepository;

public class UserService {
	
	private UserRepository repository;

	public List<AadharUser> getUsers() {
		return repository.getUserDetails();
	}

	public void saveUser(AadharUser user) {
		 repository.saveUser(user);
		
	}

}
