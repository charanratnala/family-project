package com.guru.family.service;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guru.family.dto.RegistrationDto;
import com.guru.family.entity.RegistrationEntity;
import com.guru.family.entity.Roles;
import com.guru.family.repo.RegistrationRepo;
import com.guru.family.repo.Rolesrepo;

@Service("registerService")
public class RegistrationNRolesService {
	
	@Autowired
	JavaMailSenders  javaMailSenders;

	@Autowired
	HttpSession httpSession;

	@Autowired
	Rolesrepo rolesrepo;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	RegistrationRepo registrationRepo;

	public RegistrationEntity addUser(RegistrationDto registrationDto) {
		RegistrationEntity registrationEntity = new RegistrationEntity();
		if (registrationDto.getUserName().equals(null))

			throw new RuntimeException("all the fields are null in registration");

		else

			// registrationEntity.setRoles(registrationDto.get);

			modelMapper.map(registrationDto, registrationEntity);
//
//		Roles r = new Roles();
//
//	//Roles rr=	rolesrepo.findByName("Father");
//		
//	//Optional<Roles> rr=	rolesrepo.findById(1);
//	
////	rr.setId(rr.getId());
//	//System.out.println(rr);
//	
//	//Roles ror=null;
//	
//	
//	r.setId(1);
//	
////	if(rr.isPresent())
////	{
////		ror=rr.get();
////	}
////		
////	Set set=new HashSet<>();
////	//System.out.println("50 "+ls);
////	
////	
//	registrationEntity.getRoles().add(r);
//	
//	//System.out.println("53 "+ls);
//		
//
//		//registrationEntity.setRoles(set);
//		
//		//rr.setEntity(registrationEntity);
//		//System.out.println(set);
//		System.out.println(registrationEntity);

		return registrationRepo.save(registrationEntity);

	}

	public void addRole(String customName) {

		if (rolesrepo.existsByName(customName))

			throw new RuntimeException("role name already there ");

		else {
			Roles rol = new Roles();

			rol.setName(customName);

			rolesrepo.save(rol);
		}

	}

	public void deleteRole(String roleName) {

		if (!rolesrepo.existsByName(roleName)) {
			throw new RuntimeException("role name not found");
		}
		Roles ro = rolesrepo.findByName(roleName);

		rolesrepo.delete(ro);

	}

	public void getEmailNver(String email) {
		Random random = new Random();
		int i = 0;
		if (registrationRepo.existsByEmail(email))
			// Random rw= new Random();

			i = random.nextInt(9999);

		if (i <=100) {
			i = i + 100;
		}

	httpSession.setAttribute("otp", random);
		
		
		Object st=  httpSession.getAttribute("otp");
		System.out.println(st);
		  httpSession.setMaxInactiveInterval(2000);
		
		javaMailSenders.sendMail(email, "Hloo Fellas Here's Is Your Otp  ", " Hyy Dude  !!!!!!!!1");
	}

}
