package com.guru.family.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String email;
	private Date dob;
	
	private String userName;
	private double phoneNumber;
	private String gender;
	
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
	@JoinColumn(name="role_ref",referencedColumnName = "id")
	Set<Roles> roles= new HashSet<Roles>();
	
	
	

}
