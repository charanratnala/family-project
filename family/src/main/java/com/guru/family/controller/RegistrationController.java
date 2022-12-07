package com.guru.family.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.guru.family.dto.RegistrationDto;
import com.guru.family.entity.RegistrationEntity;
import com.guru.family.service.RegistrationService;

@RestController
@RequestMapping("/api/v1-fam")
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	
	
	
	@PostMapping("/registration")
	@ResponseStatus(value=HttpStatus.CREATED)
	public RegistrationEntity addUser(@RequestBody RegistrationDto registrationDto )
	{

		return 	registrationService.addUser(registrationDto);
		

	}
	
	
	
	@PostMapping("/createRole/{customName}")
	@ResponseStatus(value=HttpStatus.CONFLICT)
	public void customRole(@PathVariable String customName)
	{
		
		registrationService.addRole(customName);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
