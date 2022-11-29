package com.guru.family.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.guru.family.entity.RegistrationEntity;
import com.guru.family.entity.Roles;

public class ImpleUserDetails  implements UserDetails{

	
	public ImpleUserDetails(RegistrationEntity registrationEntity) {
		super();
		this.registrationEntity = registrationEntity;
	}

	RegistrationEntity registrationEntity;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		
		
	List<Roles> re=	registrationEntity.getRoles();
	
	List<SimpleGrantedAuthority> authorities= new ArrayList<>();
	
	for(Roles rol: re)
	{
	  authorities.add(new SimpleGrantedAuthority(rol.getName()));
	}
	
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return registrationEntity.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return registrationEntity.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
