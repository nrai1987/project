package com.nishika.libraryManagement.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nishika.libraryManagement.model.User;

@RestController
public class UserManagementController {
	
	@RequestMapping(value="/user", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  Map<String,String> getUser() {
		System.out.println("Hello");
		Map<String,String> userMap = new HashMap<>();
		userMap.put("uid", "First user");
		return userMap;
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	@ResponseBody
	public  String addUser(@RequestBody User user) {
		
		return "User added succefully..."+user.getName();
	}
}
