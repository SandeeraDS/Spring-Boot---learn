package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.LoginService;
import com.example.demo.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value ="/list-todos", method = RequestMethod.GET)
	public String showTodosList(ModelMap model) {
		model.put("todos", service.retrieveTodos("in28Minutes"));
//		System.out.println("name is "+name);
		return "list-todos";
	}
//	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		boolean isValidUser = service.validateUser(name, password);
//		
//		if (!isValidUser) {
//			model.put("errorMessage","Invalid Creaditials");
//			return "login";
//		}
//		
//		model.put("name", name);
//		model.put("password", password);
////		System.out.println("name is "+name);
//		return "welcome";
//	}
//
}
