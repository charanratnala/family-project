package com.guru.family.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guru.family.dto.RegistrationDto;
import com.guru.family.entity.RegistrationEntity;
import com.guru.family.entity.Roles;
import com.guru.family.repo.RegistrationRepo;
import com.guru.family.repo.Rolesrepo;

@Service("registerService")
public class RegistrationService {
	
	@Autowired
	Rolesrepo rolesrepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	RegistrationRepo registrationRepo;

	public RegistrationEntity addUser(RegistrationDto registrationDto) {
		RegistrationEntity registrationEntity= new RegistrationEntity();
		if(registrationDto.getUserName().equals(null))
		
	throw new RuntimeException("all the fields are null in registration");
	
		else	
			
		//	registrationEntity.setRoles(registrationDto.get);
			
			modelMapper.map(registrationDto, registrationEntity); 
	return	registrationRepo.save(registrationEntity);
		
		
		
		
	}

	public void addRole(String customName) {
		
		Roles rol= new Roles();
		
		rol.setName(customName);
		
		rolesrepo.save(rol);
		
		
	}

}
