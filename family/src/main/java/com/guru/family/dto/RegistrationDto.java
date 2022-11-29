package com.guru.family.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

import com.guru.family.entity.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String email;
	private Date dob;
	
	private String userName;
	private double phoneNumber;
	private String gender;
	@OneToMany
	List<Roles> roles= new ArrayList<>();

}
