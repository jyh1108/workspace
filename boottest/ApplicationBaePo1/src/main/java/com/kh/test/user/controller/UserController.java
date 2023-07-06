package com.kh.test.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.user.model.service.UserService;
import com.kh.test.user.model.vo.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String searchId(User userId) {
		String mamberId   = service.searchId(userId);
		
		  if(mamberId != null) {
		return ("templates/searchSuccess");
		  }else {
			  return ("templates/searchFail");
		  }
	}
}
