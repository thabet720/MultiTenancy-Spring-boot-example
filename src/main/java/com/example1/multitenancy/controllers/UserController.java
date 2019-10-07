package com.example1.multitenancy.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example1.multitenancy.entities.User;
import com.example1.multitenancy.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/")
	public String save(@RequestBody User user) {
		service.save(user);
		return "success";
	}
	
	@GetMapping("/")
	public List<User> getUsers(){
		return service.getUsers();
	}
}
