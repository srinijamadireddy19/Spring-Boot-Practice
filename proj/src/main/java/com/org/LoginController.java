package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showHomePage(@RequestParam("username") String username,
			@RequestParam("password") String password
	) {
		System.out.println("Password received: " + password);
		if (username!= "" && password!="" ) {
			return "home";
		} else {
			return "error";
		}
	}
}
