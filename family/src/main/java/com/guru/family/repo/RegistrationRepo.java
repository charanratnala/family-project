package com.guru.family.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guru.family.entity.RegistrationEntity;

public interface RegistrationRepo extends JpaRepository<RegistrationEntity, Integer>{
	
	
	boolean existsByUserName(String username);
	boolean existsByEmail(String email);
	
	RegistrationEntity findByUserName(String userName);

}
