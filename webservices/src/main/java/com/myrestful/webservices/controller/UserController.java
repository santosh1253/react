package com.myrestful.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myrestful.webservices.exceptions.UserNotFoundException;
import com.myrestful.webservices.mypack.User;
import com.myrestful.webservices.mypack.UserDao;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	
	

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@RequestMapping("/users/{id}")
	public User findOne(@PathVariable int id) {
		User res = userDao.findById(id);
		if (res == null)
			throw new UserNotFoundException(id);
		return res;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/users")
	public User createUser(@Valid @RequestBody User user) {
		return userDao.saveUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		userDao.deleteById(id);
	}

}
