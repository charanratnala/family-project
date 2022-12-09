package com.guru.family.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guru.family.entity.Roles;

public interface Rolesrepo  extends JpaRepository<Roles, Integer>{
	
	
   public Roles findByName(String name);
   
   public boolean existsByName(String name);

}
