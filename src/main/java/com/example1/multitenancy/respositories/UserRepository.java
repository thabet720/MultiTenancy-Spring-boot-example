package com.example1.multitenancy.respositories;

import org.springframework.data.repository.CrudRepository;


import com.example1.multitenancy.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByName(String name); 

}
