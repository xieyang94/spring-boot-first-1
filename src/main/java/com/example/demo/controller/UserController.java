package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;

@RestController()
public class UserController {
	
	@RequestMapping("hello/getUser")
	public User getUser() {
		User user=new User();
		
		user.setDate(new Date());
		user.setUserName("13260922711");
		user.setPassword("1234566");
		user.setSex("man");
		return user;
	}
}
