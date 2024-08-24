package com.metromart.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metromart.site.entity.CreateAccount;
import com.metromart.site.service.AccountCreateService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/metromart/signup")
public class CreateAccountController {
	
	@Autowired
	private AccountCreateService userservice;
	
	@GetMapping("/home")
	public String getProjectName(HttpServletRequest http) {
		
		return "Ecommmerce-site  -  "+http.getSession().getId();
	}

	@GetMapping("/csrf-tokan")
	public String getcsrf(HttpServletRequest http) {
		
		return (String) http.getAttribute("_csrf");
		
	}
	
	@GetMapping("/all-users")
	public List<CreateAccount> getAllUserDetails(){
		return userservice.getAllUserDetails();
	}
	
	@PostMapping("/new-user")
	public CreateAccount addNewUser(@RequestBody CreateAccount adding) {
		return userservice.addNewUser(adding);
	}
	
	@PutMapping("/modify-user")
	public CreateAccount modifyUserDetails(@RequestBody CreateAccount update) {
		return userservice.modifyUserDetails(update);
	}
	

}
