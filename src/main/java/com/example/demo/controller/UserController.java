package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;
//
//	@PostMapping("/add-user")
//	public User creatUser(@RequestBody User user) {
//		listUsers.add(user);
//		return user;
//	}

	@GetMapping("/show-all")
	public List<User> showAllUser() {
		return userServiceImpl.showAll();
	}

//	@DeleteMapping("/delete-user")
//	public void deleteUser(@RequestParam(name = "id") int id) {
//		for (int i = 0; i < listUsers.size(); i++) {
//			if (listUsers.get(i).getId() == id) {
//				listUsers.remove(i);
//			}
//		}
//	}
//
//	@PutMapping("/update-user")
//	public void updateUser(@RequestBody User user) {
//		for (int i = 0; i < listUsers.size(); i++) {
//			if (listUsers.get(i).getId() == user.getId()) {
//				listUsers.set(i, user);
//			}
//		}
//	}
}
