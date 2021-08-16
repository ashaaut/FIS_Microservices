package com.fis.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.userservice.bean.User;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping("{/id}")
	public User getUser(@PathVariable int id) {
		return new User(1,"asha");
	}
}
