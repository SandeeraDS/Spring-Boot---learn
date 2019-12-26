package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		model.put("name", "154048G");
//		System.out.println("name is "+name);
		return "welcome";
	}
//before use default login page
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String showLoginPage(ModelMap model) {
////		model.put("name", name);
////		System.out.println("name is "+name);
//		return "login";
//	}
//	now use default login page
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		boolean isValidUser = service.validateUser(name, password);
//
//		if (!isValidUser) {
//			model.put("errorMessage", "Invalid Creaditials");
//			return "login";
//		}
//
//		model.put("name", name);
//		model.put("password", password);
////		System.out.println("name is "+name);
//		return "welcome";
//	}

}
