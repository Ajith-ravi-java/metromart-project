package com.metromart.site.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.metromart.site.entity.CreateAccount;


public class myUserPrinciple implements UserDetails{

	private CreateAccount user;
	public myUserPrinciple(CreateAccount user) {
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
