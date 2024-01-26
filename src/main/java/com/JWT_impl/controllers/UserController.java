package com.JWT_impl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JWT_impl.services.UserService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/home")
@Log4j2
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		log.info("fetching users");
		return ResponseEntity.ok(userService.getListOfUsersDetail());
		
	}

}
