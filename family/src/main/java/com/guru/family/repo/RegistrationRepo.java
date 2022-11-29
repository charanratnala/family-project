package com.guru.family.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guru.family.entity.RegistrationEntity;

public interface RegistrationRepo extends JpaRepository<RegistrationEntity, Long>{
	
	
	boolean existsByUserName(String username);
	
	RegistrationEntity findByUserName(String userName);

}
