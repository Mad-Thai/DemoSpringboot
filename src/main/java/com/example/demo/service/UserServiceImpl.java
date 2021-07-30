package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.IUserRepository;
import com.example.demo.entity.User;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserRepository iUserRepository;

	public List<User> showAll() {
		return iUserRepository.findAll();

	}

	public User saveUser(User user) {
		return iUserRepository.save(user);
	}

	public void deleteUser(int id) {
		iUserRepository.deleteById(id);
	}

	public User getUserById(int id) {
		return iUserRepository.getById(id);
	}

	public User updateUser(int id, User user) {
		User _user = iUserRepository.getById(id);
		System.out.println(_user.toString());
		_user.setName(user.getName());
		_user.setEmail(user.getEmail());
		_user.setPassword(user.getPassword());
		_user.setAddress(user.getAddress());
		_user.setPhoneNumber(user.getPhoneNumber());

		return iUserRepository.save(_user);
	}

}
