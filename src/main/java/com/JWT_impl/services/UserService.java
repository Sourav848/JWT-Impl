package com.JWT_impl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.JWT_impl.models.User;

@Service
public class UserService {

	private List<User> userList = new ArrayList<>();
	
	public UserService() {
		userList.add(new User(UUID.randomUUID().toString(), "Sourav Kumar", "sourav@dev.in", "Patna"));
		userList.add(new User(UUID.randomUUID().toString(), "Harsh Yadav", "harsh@dev.in", "Kolkata"));
		userList.add(new User(UUID.randomUUID().toString(), "Shadab Quaiser", "shadab@dev.in", "Bengaluru"));
		userList.add(new User(UUID.randomUUID().toString(), "Abhishek Garg", "abhishek@dev.in", "Varanasi"));
		userList.add(new User(UUID.randomUUID().toString(), "Akanksha Raj", "akanksha@dev.in", "Bengaluru"));
	}
	
	public List<User> getListOfUsersDetail() {
		return this.userList;
	}
	
	
}
