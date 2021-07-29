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
}
