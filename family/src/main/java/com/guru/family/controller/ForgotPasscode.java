package com.guru.family.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.guru.family.service.RegistrationNRolesService;

@RestController
@RequestMapping("/forgot")
public class ForgotPasscode {
	
	@Autowired
	RegistrationNRolesService nRolesService;
	
	
	@GetMapping("/getEmail/{email}")
	@ResponseStatus(value = HttpStatus.OK)
	public void getEmail(@PathVariable  String email)
	{
		nRolesService.getEmailNver(email);
		System.out.println("mail sent successfully");
		
		
	}
	
	

}
