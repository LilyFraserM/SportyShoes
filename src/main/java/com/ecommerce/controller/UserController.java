package com.ecommerce.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.model.product;
import com.ecommerce.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService service;
	
	
	
	// retrieve all users from database
	@GetMapping("/users")
	public List<User> list() {
        return service.listAllUser();
    }
	

	
	//get particular users by their ID
		@GetMapping("/users/{id}")
		public ResponseEntity<User> getUser(@PathVariable Integer id)
		{
			try {
				User user= service.getUser(id);
				return new ResponseEntity<User>(user,HttpStatus.OK);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
			}
		}
	// insert new user into user table
	@PostMapping("/users")
	public void add(@RequestBody User user)
	{
		service.saveUser(user);
	}
	
	@PutMapping("users/{id}")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id){
	
		try {
			User userExists = service.getUser(id);
			service.saveUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// delete particular student from database
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		service.deleteUser(id);
	}
}
