package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@SessionAttributes("name") - now we get user name using priciple
public class WelcomeController {

//	@Autowired
//	LoginService service; - now we don't use this service

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUserName());
//		System.out.println("name is "+name);
		return "welcome";
	}

	public String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
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
