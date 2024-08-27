package com.metromart.site.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.metromart.site.entity.SignUp;


public class myUserPrinciple implements UserDetails{

	private SignUp user;
	public myUserPrinciple(SignUp user) {
		this.user=user;
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		System.out.println(user.getPassword());
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		System.out.println(user.getUsername());
		return user.getUsername();
	}

}
