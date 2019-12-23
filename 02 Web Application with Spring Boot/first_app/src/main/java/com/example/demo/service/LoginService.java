package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String userid, String password) {	
		//154048G - 154048
		return userid.equalsIgnoreCase("154048g") && password.equalsIgnoreCase("154048g");
	}
}
