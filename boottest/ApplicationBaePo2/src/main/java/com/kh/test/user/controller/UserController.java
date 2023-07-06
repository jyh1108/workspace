package com.kh.test.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.user.model.service.UserService;
import com.kh.test.user.model.vo.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@GetMapping("/searchNo")
	
	public String searchNober(User userNo, Model model) {
		
		User searchNo = service.searchNober(userNo);
			
			model.addAttribute("searchNo", searchNo);
			return "searchSuccess";
		}
		
}