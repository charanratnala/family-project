package com.guru.family.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.guru.family.entity.RegistrationEntity;
import com.guru.family.repo.RegistrationRepo;
@Service
public class ImpleUserDetailService implements UserDetailsService{

	
	
	@Autowired
	RegistrationRepo registrationRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		 RegistrationEntity reg = null;
	if(	registrationRepo.existsByUserName(username))
	
	      reg=  	 registrationRepo.findByUserName(username);
	
	
	return new ImpleUserDetails(reg); 
		
	}
	
	
	
	

}
