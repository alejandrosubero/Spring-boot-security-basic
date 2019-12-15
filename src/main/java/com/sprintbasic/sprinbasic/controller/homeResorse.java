package com.sprintbasic.sprinbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class homeResorse {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView method(){
		return new ModelAndView ("redirect:"+"https://github.com/alejandrosubero?tab=repositories");
	}

	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Wellcome user</h1>");
	}
	
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Wellcome Admin</h1>");
	}
	

	
	
	
	
}
