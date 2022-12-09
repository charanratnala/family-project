package com.guru.family;

import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyApplication.class, args);
		
		Random random = new Random();
		
	int i=	random.nextInt(9999);
		
	
	System.out.println(i);
	
//Supplier<Double> s=	()->	Math.random();
//System.out.println(s.get());
////		
//		Map<String,RegistrationEntity> map= new HashMap<>();
//		
//		map.put("sai", new RegistrationEntity(0, null, null, null, null, null, null, null, 0, null, null));
		
		
		
		
	}
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
