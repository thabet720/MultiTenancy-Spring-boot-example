package com.example1.multitenancy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.multitenancy.entities.User;
import com.example1.multitenancy.respositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public void save(User user) {
		repo.save(user);
	}
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<User>();
		for(User user: repo.findAll())
			users.add(user);
		
		return users;
	}

}
