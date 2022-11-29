package com.guru.family;

import java.util.HashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.guru.family.entity.RegistrationEntity;

@SpringBootApplication
public class FamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyApplication.class, args);
//		
//		Map<String,RegistrationEntity> map= new HashMap<>();
//		
//		map.put("sai", new RegistrationEntity(0, null, null, null, null, null, null, null, 0, null, null));
		
		
		
		
	}
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
