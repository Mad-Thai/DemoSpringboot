package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.IUserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;

	@Autowired
	IUserRepository iUserRepository;

	@PostMapping("/add-user")
	public User createUser(@RequestBody User user) {
		return userServiceImpl.saveUser(user);
	}

	@GetMapping("/show-all")
	public List<User> showAllUser() {
		return userServiceImpl.showAll();
	}

	@PutMapping("/update-user/{id}")
	public User updateUser(@PathVariable("id") int id, @RequestBody User user) {
		return userServiceImpl.updateUser(id, user);
	}

	@DeleteMapping("/delete-user")
	public void deleteUser(@RequestParam(name = "id") int id) {
		userServiceImpl.deleteUser(id);
	}

}
